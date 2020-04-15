package com.frgp.f1telemetry.entity.elements;

public class CarStatusData {

    private int tractionControl;
    private boolean antiLockBrakes;
    private int fuelMix;
    private int frontBrakeBias;
    private boolean pitLimiterOn;
    private float fuelInTank;
    private float fuelCapacity;
    private float fuelRemainingLaps;
    private int maxRpm;
    private int idleRpm;
    private int maxGears;
    private int drsAllowed;
    private WheelData<Integer> tyresWear;
    private int actualTyreCompound;
    private int tyreVisualCompound;
    private WheelData<Integer> tyresDamage;
    private int frontLeftWheelDamage;
    private int frontRightWingDamage;
    private int rearWingDamage;
    private int engineDamage;
    private int gearBoxDamage;
    private int vehicleFiaFlags;
    private float ersStoreEnergy;
    private int ersDeployMode;
    private float ersHarvestedThisLapMGUK;
    private float ersHarvestedThisLapMGUH;
    private float ersDeployedThisLap;


    public CarStatusData() {
    }

    public int getTractionControl() {
        return tractionControl;
    }

    public void setTractionControl(int tractionControl) {
        this.tractionControl = tractionControl;
    }

    public boolean isAntiLockBrakes() {
        return antiLockBrakes;
    }

    public void setAntiLockBrakes(boolean antiLockBrakes) {
        this.antiLockBrakes = antiLockBrakes;
    }

    public int getFuelMix() {
        return fuelMix;
    }

    public void setFuelMix(int fuelMix) {
        this.fuelMix = fuelMix;
    }

    public int getFrontBrakeBias() {
        return frontBrakeBias;
    }

    public void setFrontBrakeBias(int frontBrakeBias) {
        this.frontBrakeBias = frontBrakeBias;
    }

    public boolean isPitLimiterOn() {
        return pitLimiterOn;
    }

    public void setPitLimiterOn(boolean pitLimiterOn) {
        this.pitLimiterOn = pitLimiterOn;
    }

    public float getFuelInTank() {
        return fuelInTank;
    }

    public void setFuelInTank(float fuelInTank) {
        this.fuelInTank = fuelInTank;
    }

    public float getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(float fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public float getFuelRemainingLaps() {
        return fuelRemainingLaps;
    }

    public void setFuelRemainingLaps(float fuelRemainingLaps) {
        this.fuelRemainingLaps = fuelRemainingLaps;
    }

    public int getMaxRpm() {
        return maxRpm;
    }

    public void setMaxRpm(int maxRpm) {
        this.maxRpm = maxRpm;
    }

    public int getIdleRpm() {
        return idleRpm;
    }

    public void setIdleRpm(int idleRpm) {
        this.idleRpm = idleRpm;
    }

    public int getMaxGears() {
        return maxGears;
    }

    public void setMaxGears(int maxGears) {
        this.maxGears = maxGears;
    }

    public int getDrsAllowed() {
        return drsAllowed;
    }

    public void setDrsAllowed(int drsAllowed) {
        this.drsAllowed = drsAllowed;
    }

    public WheelData<Integer> getTyresWear() {
        return tyresWear;
    }

    public void setTyresWear(WheelData<Integer> tyresWear) {
        this.tyresWear = tyresWear;
    }

    public int getActualTyreCompound() {
        return actualTyreCompound;
    }

    public void setActualTyreCompound(int actualTyreCompound) {
        this.actualTyreCompound = actualTyreCompound;
    }

    public int getTyreVisualCompound() {
        return tyreVisualCompound;
    }

    public void setTyreVisualCompound(int tyreVisualCompound) {
        this.tyreVisualCompound = tyreVisualCompound;
    }

    public WheelData<Integer> getTyresDamage() {
        return tyresDamage;
    }

    public void setTyresDamage(WheelData<Integer> tyresDamage) {
        this.tyresDamage = tyresDamage;
    }

    public int getFrontLeftWheelDamage() {
        return frontLeftWheelDamage;
    }

    public void setFrontLeftWheelDamage(int frontLeftWheelDamage) {
        this.frontLeftWheelDamage = frontLeftWheelDamage;
    }

    public int getFrontRightWingDamage() {
        return frontRightWingDamage;
    }

    public void setFrontRightWingDamage(int frontRightWingDamage) {
        this.frontRightWingDamage = frontRightWingDamage;
    }

    public int getRearWingDamage() {
        return rearWingDamage;
    }

    public void setRearWingDamage(int rearWingDamage) {
        this.rearWingDamage = rearWingDamage;
    }

    public int getEngineDamage() {
        return engineDamage;
    }

    public void setEngineDamage(int engineDamage) {
        this.engineDamage = engineDamage;
    }

    public int getGearBoxDamage() {
        return gearBoxDamage;
    }

    public void setGearBoxDamage(int gearBoxDamage) {
        this.gearBoxDamage = gearBoxDamage;
    }

    public int getVehicleFiaFlags() {
        return vehicleFiaFlags;
    }

    public void setVehicleFiaFlags(int vehicleFiaFlags) {
        this.vehicleFiaFlags = vehicleFiaFlags;
    }

    public float getErsStoreEnergy() {
        return ersStoreEnergy;
    }

    public void setErsStoreEnergy(float ersStoreEnergy) {
        this.ersStoreEnergy = ersStoreEnergy;
    }

    public int getErsDeployMode() {
        return ersDeployMode;
    }

    public void setErsDeployMode(int ersDeployMode) {
        this.ersDeployMode = ersDeployMode;
    }

    public float getErsHarvestedThisLapMGUK() {
        return ersHarvestedThisLapMGUK;
    }

    public void setErsHarvestedThisLapMGUK(float ersHarvestedThisLapMGUK) {
        this.ersHarvestedThisLapMGUK = ersHarvestedThisLapMGUK;
    }

    public float getErsHarvestedThisLapMGUH() {
        return ersHarvestedThisLapMGUH;
    }

    public void setErsHarvestedThisLapMGUH(float ersHarvestedThisLapMGUH) {
        this.ersHarvestedThisLapMGUH = ersHarvestedThisLapMGUH;
    }

    public float getErsDeployedThisLap() {
        return ersDeployedThisLap;
    }

    public void setErsDeployedThisLap(float ersDeployedThisLap) {
        this.ersDeployedThisLap = ersDeployedThisLap;
    }

}
