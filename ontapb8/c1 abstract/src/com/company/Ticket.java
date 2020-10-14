package com.company;

public abstract class Ticket {
    private Gate origin;
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

    public abstract void adjustValue(int amount);
    public abstract boolean isValid();

    public  void  deduct(int amount){
        value -= amount;
    }
    public void  setOrigin(Gate origin){
        if (origin == null){
            this.origin = null;
        }else
            this.origin = origin;
    }

    public Gate getOrigin() {
        return origin;
    }
    @Override
    public String toString(){
        return "value :"+value + "valid" + valid;
    }
}
