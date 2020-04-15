package com.frgp.f1telemetry.entity;

public class PacketEventData extends Packet {

    private String eventCode;
    private int eventDetailsVehicleIdx;
    private float lapTime = 0;

    public PacketEventData() {
    }

    public String getEventCode() {
        return eventCode;
    }

    public void setEventCode(String eventCode) {
        this.eventCode = eventCode;
    }

    public int getEventDetailsVehicleIdx() {
        return eventDetailsVehicleIdx;
    }

    public void setEventDetailsVehicleIdx(int eventDetailsVehicleIdx) {
        this.eventDetailsVehicleIdx = eventDetailsVehicleIdx;
    }

    public float getLapTime() {
        return lapTime;
    }

    public void setLapTime(float lapTime) {
        this.lapTime = lapTime;
    }
}
