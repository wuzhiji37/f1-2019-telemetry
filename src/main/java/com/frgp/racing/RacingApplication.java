package com.frgp.racing;

import com.frgp.f1telemetry.F12019TelemetryUDPServer;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
@MapperScan("com.frgp.racing")
public class RacingApplication {
    private static final Logger log = LoggerFactory.getLogger(F12019TelemetryUDPServer.class);

    public static void main(String[] args) throws IOException {
        SpringApplication.run(RacingApplication.class, args);
        F12019TelemetryUDPServer.main();
    }

}
