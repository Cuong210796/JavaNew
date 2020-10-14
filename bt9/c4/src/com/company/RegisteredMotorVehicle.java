package com.company;

public class RegisteredMotorVehicle extends RegisteredVehicle {
    private int emptyWeight;
    private int lastOdometer;

    public RegisteredMotorVehicle(String tag, String registeredTo, String owner, int emptyWeight, int lastOdometer) {
        super(tag, registeredTo, owner);
        this.emptyWeight = emptyWeight;
        this.lastOdometer = lastOdometer;
    }

    public int getEmptyWeight() {
        return emptyWeight;
    }

    public int getLastOdometer() {
        return lastOdometer;
    }

    @Override
    void reRegister() {

    }
}
