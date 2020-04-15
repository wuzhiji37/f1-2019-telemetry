package com.frgp.f1telemetry.entity;

import com.frgp.f1telemetry.entity.elements.ButtonStatus;
import com.frgp.f1telemetry.entity.elements.CarTelemetryData;

import java.util.List;

public class PacketCarTelemetryData extends Packet {

    private List<CarTelemetryData> carTelemetryData;
    private ButtonStatus buttonStatus; // TODO, create a representation of this data properly

    public PacketCarTelemetryData() {
    }

    public List<CarTelemetryData> getCarTelemetryData() {
        return carTelemetryData;
    }

    public void setCarTelemetryData(List<CarTelemetryData> carTelemetryData) {
        this.carTelemetryData = carTelemetryData;
    }

    public ButtonStatus getButtonStatus() {
        return buttonStatus;
    }

    public void setButtonStatus(ButtonStatus buttonStatus) {
        this.buttonStatus = buttonStatus;
    }

}
