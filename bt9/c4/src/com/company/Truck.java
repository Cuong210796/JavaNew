package com.company;

public class Truck extends RegisteredMotorVehicle {
    private String truckType;


    public Truck(String tag, String registeredTo, String owner, int emptyWeight, int lastOdometer, String truckType) {
        super(tag, registeredTo, owner, emptyWeight, lastOdometer);
        this.truckType = truckType;
    }
}
