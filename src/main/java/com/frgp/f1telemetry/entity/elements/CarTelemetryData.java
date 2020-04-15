package com.frgp.f1telemetry.entity.elements;

public class CarTelemetryData {

    private int speed;
    private float throttle;
    private float steer;
    private float brake;
    private int clutch;
    private int gear;
    private int engineRpm;
    private boolean drs;
    private int revLightsPercent;
    private WheelData<Integer> brakeTemperature;
    private WheelData<Integer> tireSurfaceTemperature;
    private WheelData<Integer> tireInnerTemperature;
    private int engineTemperature;
    private WheelData<Float> tirePressure;
    private WheelData<Integer> surfaceType;

    public CarTelemetryData() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public float getThrottle() {
        return throttle;
    }

    public void setThrottle(float throttle) {
        this.throttle = throttle;
    }

    public float getSteer() {
        return steer;
    }

    public void setSteer(float steer) {
        this.steer = steer;
    }

    public float getBrake() {
        return brake;
    }

    public void setBrake(float brake) {
        this.brake = brake;
    }

    public int getClutch() {
        return clutch;
    }

    public void setClutch(int clutch) {
        this.clutch = clutch;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getEngineRpm() {
        return engineRpm;
    }

    public void setEngineRpm(int engineRpm) {
        this.engineRpm = engineRpm;
    }

    public boolean isDrs() {
        return drs;
    }

    public void setDrs(boolean drs) {
        this.drs = drs;
    }

    public int getRevLightsPercent() {
        return revLightsPercent;
    }

    public void setRevLightsPercent(int revLightsPercent) {
        this.revLightsPercent = revLightsPercent;
    }

    public WheelData<Integer> getBrakeTemperature() {
        return brakeTemperature;
    }

    public void setBrakeTemperature(WheelData<Integer> brakeTemperature) {
        this.brakeTemperature = brakeTemperature;
    }

    public WheelData<Integer> getTireSurfaceTemperature() {
        return tireSurfaceTemperature;
    }

    public void setTireSurfaceTemperature(WheelData<Integer> tireSurfaceTemperature) {
        this.tireSurfaceTemperature = tireSurfaceTemperature;
    }

    public WheelData<Integer> getTireInnerTemperature() {
        return tireInnerTemperature;
    }

    public void setTireInnerTemperature(WheelData<Integer> tireInnerTemperature) {
        this.tireInnerTemperature = tireInnerTemperature;
    }

    public int getEngineTemperature() {
        return engineTemperature;
    }

    public void setEngineTemperature(int engineTemperature) {
        this.engineTemperature = engineTemperature;
    }

    public WheelData<Float> getTirePressure() {
        return tirePressure;
    }

    public void setTirePressure(WheelData<Float> tirePressure) {
        this.tirePressure = tirePressure;
    }

    public WheelData<Integer> getSurfaceType() {
        return surfaceType;
    }

    public void setSurfaceType(WheelData<Integer> surfaceType) {
        this.surfaceType = surfaceType;
    }
}
