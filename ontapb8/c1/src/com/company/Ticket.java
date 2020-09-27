package com.company;

public abstract class Ticket {
    private double value;
    private double deduct;

    public double getValue() {
        return value;
    }

    abstract void adjustValue();
}
