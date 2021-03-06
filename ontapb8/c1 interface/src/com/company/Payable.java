package com.company;

public interface Payable {
    int getValue();
    void adjustValue(int amount);
    void deduct(int amount);
    void setOrigin(Gate gate);
    Gate getOrigin();
    boolean isValid();
    void setValid(boolean valid);
}
