package com.frgp.f1telemetry.entity;

import com.frgp.f1telemetry.entity.elements.MarshalZone;

import java.util.List;

public class PacketSessionData extends Packet {

    private int weather;
    private int trackTemperature;
    private int airTemperature;
    private int totalLaps;
    private int trackLength;
    private int sessionType;
    private int trackId;
    private int formula;
    private int sessionTimeLeft;
    private int sessionDuration;
    private int pitSpeedLimit;
    private boolean gamePaused;
    private boolean spectating;
    private int spectatorCarIndex;
    private boolean sliProNativeSupport;
    private int numMarshalZones;
    private List<MarshalZone> marshalZones;
    private int safetyCarStatus;
    private boolean networkGame;

    public PacketSessionData() {
    }

    public int getWeather() {
        return weather;
    }

    public void setWeather(int weather) {
        this.weather = weather;
    }

    public int getTrackTemperature() {
        return trackTemperature;
    }

    public void setTrackTemperature(int trackTemperature) {
        this.trackTemperature = trackTemperature;
    }

    public int getAirTemperature() {
        return airTemperature;
    }

    public void setAirTemperature(int airTemperature) {
        this.airTemperature = airTemperature;
    }

    public int getTotalLaps() {
        return totalLaps;
    }

    public void setTotalLaps(int totalLaps) {
        this.totalLaps = totalLaps;
    }

    public int getTrackLength() {
        return trackLength;
    }

    public void setTrackLength(int trackLength) {
        this.trackLength = trackLength;
    }

    public int getSessionType() {
        return sessionType;
    }

    public void setSessionType(int sessionType) {
        this.sessionType = sessionType;
    }

    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    public int getFormula() {
        return formula;
    }

    public void setFormula(int formula) {
        this.formula = formula;
    }

    public int getSessionTimeLeft() {
        return sessionTimeLeft;
    }

    public void setSessionTimeLeft(int sessionTimeLeft) {
        this.sessionTimeLeft = sessionTimeLeft;
    }

    public int getSessionDuration() {
        return sessionDuration;
    }

    public void setSessionDuration(int sessionDuration) {
        this.sessionDuration = sessionDuration;
    }

    public int getPitSpeedLimit() {
        return pitSpeedLimit;
    }

    public void setPitSpeedLimit(int pitSpeedLimit) {
        this.pitSpeedLimit = pitSpeedLimit;
    }

    public boolean getGamePaused() {
        return gamePaused;
    }

    public void setGamePaused(boolean gamePaused) {
        this.gamePaused = gamePaused;
    }

    public boolean getSpectating() {
        return spectating;
    }

    public void setSpectating(boolean spectating) {
        this.spectating = spectating;
    }

    public int getSpectatorCarIndex() {
        return spectatorCarIndex;
    }

    public void setSpectatorCarIndex(int spectatorCarIndex) {
        this.spectatorCarIndex = spectatorCarIndex;
    }

    public boolean getSliProNativeSupport() {
        return sliProNativeSupport;
    }

    public void setSliProNativeSupport(boolean sliProNativeSupport) {
        this.sliProNativeSupport = sliProNativeSupport;
    }

    public int getNumMarshalZones() {
        return numMarshalZones;
    }

    public void setNumMarshalZones(int numMarshalZones) {
        this.numMarshalZones = numMarshalZones;
    }

    public List<MarshalZone> getMarshalZones() {
        return marshalZones;
    }

    public void setMarshalZones(List<MarshalZone> marshalZones) {
        this.marshalZones = marshalZones;
    }

    public int getSafetyCarStatus() {
        return safetyCarStatus;
    }

    public void setSafetyCarStatus(int safetyCarStatus) {
        this.safetyCarStatus = safetyCarStatus;
    }

    public boolean getNetworkGame() {
        return networkGame;
    }

    public void setNetworkGame(boolean networkGame) {
        this.networkGame = networkGame;
    }

}
