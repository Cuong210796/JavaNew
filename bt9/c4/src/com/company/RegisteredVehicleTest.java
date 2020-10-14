package com.company;

public class RegisteredVehicleTest extends Truck {

    public RegisteredVehicleTest(String tag, String registeredTo, String owner, int emptyWeight, int lastOdometer, String truckType) {
        super(tag, registeredTo, owner, emptyWeight, lastOdometer, truckType);
    }

    public void error() throws Exception {
//        if (getEmptyWeight()<(getEmptyWeight()-1)) {
//

        reRegister();
        throw new Exception("tái đăng kí !!!");
    }

    @Override
    void reRegister() {
        super.reRegister();
    }
}
