package com.company;

public class Ticket {
    private Gate gate;
    private int value;
    private  boolean valid = true;

    public Ticket(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

//    public void adjustValue(int amount);
//    public boolean isValid();

    public  void  deduct(int amount){
        value -= amount;
    }
    public void  setGate(Gate gate){
        if (gate == null){
            this.gate = null;
        }else
            this.gate = gate;
    }

    public Gate getGate() {
        return gate;
    }
    @Override
    public String toString(){
        return "value :"+value + "valid" + valid;
    }
}
