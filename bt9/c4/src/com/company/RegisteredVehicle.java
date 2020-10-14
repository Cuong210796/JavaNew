package com.company;

public abstract class RegisteredVehicle {
    private String tag;
    private String registeredTo;
    private String owner;

    public RegisteredVehicle(String tag, String registeredTo, String owner) {
        this.tag = tag;
        this.registeredTo = registeredTo;
        this.owner = owner;
    }
    public void getAnnualFee(){

    }

    public void printRegistration(){
        System.out.println(tag+registeredTo+owner);
    }

    abstract void reRegister();


}
