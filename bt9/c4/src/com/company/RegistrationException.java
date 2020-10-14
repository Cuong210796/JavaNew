package com.company;

public class RegistrationException extends RegisteredMotorVehicle {


    public RegistrationException(String tag, String registeredTo, String owner, int emptyWeight, int lastOdometer) {
        super(tag, registeredTo, owner, emptyWeight, lastOdometer);
    }

}
