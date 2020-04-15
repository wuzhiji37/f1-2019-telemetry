package com.frgp.f1telemetry.entity.elements;

public class WheelData<T> {

    private T rearLeft;
    private T rearRight;
    private T frontLeft;
    private T frontRight;

    public WheelData() {
    }

    public WheelData(T[] dataPoints) {
        this.setRearLeft(dataPoints[0]);
        this.setRearRight(dataPoints[1]);
        this.setFrontLeft(dataPoints[2]);
        this.setFrontRight(dataPoints[3]);
    }

    public WheelData(T rl, T rr, T fl, T fr) {
        this.setRearLeft(rl);
        this.setRearRight(rr);
        this.setFrontLeft(fl);
        this.setFrontRight(fr);
    }

    public T getRearLeft() {
        return rearLeft;
    }

    public void setRearLeft(T rearLeft) {
        this.rearLeft = rearLeft;
    }

    public T getRearRight() {
        return rearRight;
    }

    public void setRearRight(T rearRight) {
        this.rearRight = rearRight;
    }

    public T getFrontLeft() {
        return frontLeft;
    }

    public void setFrontLeft(T frontLeft) {
        this.frontLeft = frontLeft;
    }

    public T getFrontRight() {
        return frontRight;
    }

    public void setFrontRight(T frontRight) {
        this.frontRight = frontRight;
    }

}
