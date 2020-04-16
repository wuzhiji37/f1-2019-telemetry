package com.frgp.f1telemetry;

import com.frgp.f1telemetry.entity.Packet;
import com.frgp.f1telemetry.entity.PacketSessionData;
import com.frgp.f1telemetry.util.PacketDeserializer;
import com.frgp.racing.service.impl.TlmSessionServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.DatagramChannel;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

/**
 * The base class for the F1 2019 Telemetry app. Starts up a non-blocking I/O
 * UDP server to read packets from the F1 2019 video game and then hands those
 * packets off to a parallel thread for processing based on the lambda function
 * defined. Leverages a fluent API for initialization.
 * <p>
 * Also exposes a main method for starting up a default server
 *
 * @author frgp
 */
public class F12019TelemetryUDPServer {
    @Autowired
    private static TlmSessionServiceImpl tlmSessionService;
    private static final Logger log = LoggerFactory.getLogger(F12019TelemetryUDPServer.class);

    private static final String DEFAULT_BIND_ADDRESS = "0.0.0.0";
    private static final int DEFAULT_PORT = 20777;
    private static final int MAX_PACKET_SIZE = 2048;

    private String bindAddress;
    private int port;
    private Consumer<Packet> packetConsumer;

    private F12019TelemetryUDPServer() {
        bindAddress = DEFAULT_BIND_ADDRESS;
        port = DEFAULT_PORT;
    }

    /**
     * Create an instance of the UDP server
     *
     * @return F12019TelemetryUDPServer
     */
    public static F12019TelemetryUDPServer create() {
        return new F12019TelemetryUDPServer();
    }

    public static void init() throws IOException {
        try {
            InetAddress ia = InetAddress.getLocalHost();

            String hostName = ia.getHostName();
            String hostAddress = ia.getHostAddress();
            log.info("本机名称是：" + hostName);
            log.info("本机的ip是 ：" + hostAddress);
        } catch (Exception e) {
            e.printStackTrace();
        }
        F12019TelemetryUDPServer.create()
                .bindTo("0.0.0.0")
                .onPort(20777)
                .consumeWith((p) -> {
                    log.trace(p.toJSON());
                    switch (p.getHeader().getPacketId()) {
                        case 0: // Motion
                            // motion data ignore
                            break;
                        case 1: // Session
                            ((PacketSessionData) p).save();
                            break;
                        case 2: // Lap
                            break;
                        case 3: // Lap
                            break;
                        case 4: // Lap
                            break;
                        case 5: // Lap
                            break;
                        case 6: // Lap
                            break;
                        case 7: // Lap
                            break;
                        default:
                            System.out.println(-1);

                    }
                })
                .start();
    }
    /**
     * Set the bind address
     *
     * @param bindAddress bindAddress
     * @return the server instance
     */
    public F12019TelemetryUDPServer bindTo(String bindAddress) {
        this.bindAddress = bindAddress;
        return this;
    }

    /**
     * Set the bind port
     *
     * @param port port
     * @return the server instance
     */
    public F12019TelemetryUDPServer onPort(int port) {
        this.port = port;
        return this;
    }

    /**
     * Set the consumer via a lambda function
     *
     * @param consumer consumer
     * @return the server instance
     */
    public F12019TelemetryUDPServer consumeWith(Consumer<Packet> consumer) {
        packetConsumer = consumer;
        return this;
    }

    /**
     * Start the F1 2019 Telemetry UDP server
     *
     * @throws IOException           if the server fails to start
     * @throws IllegalStateException if you do not define how the packets should be
     *                               consumed
     */
    public void start() throws IOException {

        if (packetConsumer == null) {
            throw new IllegalStateException("You must define how the packets will be consumed.");
        }

        log.info("F1 2019 - Telemetry UDP Server");

        // Create an executor to process the Packets in a separate thread
        // To be honest, this is probably an over-optimization due to the use of NIO,
        // but it was done to provide a simple way of providing back pressure on the
        // incoming UDP packet handling to allow for long-running processing of the
        // Packet object, if required.
        ExecutorService executor = Executors.newSingleThreadExecutor();

        try (DatagramChannel channel = DatagramChannel.open()) {
            channel.socket().bind(new InetSocketAddress(bindAddress, port));
            log.info("Listening on " + bindAddress + ":" + port + "...");
            ByteBuffer buf = ByteBuffer.allocate(MAX_PACKET_SIZE);
            buf.order(ByteOrder.LITTLE_ENDIAN);
            while (true) {
                channel.receive(buf);
                final Packet packet = PacketDeserializer.read(buf.array());
                executor.submit(() -> packetConsumer.accept(packet));
                buf.clear();
            }
        } finally {
            executor.shutdown();
        }
    }
}
