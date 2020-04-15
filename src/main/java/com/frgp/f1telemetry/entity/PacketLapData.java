package com.frgp.f1telemetry.entity;

import com.frgp.f1telemetry.entity.elements.LapData;

import java.util.List;

public class PacketLapData extends Packet {

    private List<LapData> lapDataList;

    public PacketLapData() {
    }

    public List<LapData> getLapDataList() {
        return lapDataList;
    }

    public void setLapDataList(List<LapData> lapDataList) {
        this.lapDataList = lapDataList;
    }

}
