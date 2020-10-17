package com.company;

public class Employee {
    private double basaSalary;
    private float hourlyRate;
    private byte extraHour;

    public double getBasaSalary() {
        return basaSalary;
    }

    public void setBasaSalary(double basaSalary) {
        this.basaSalary = basaSalary;
    }

    public float getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(float hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public byte getExtraHour() {
        return extraHour;
    }

    public void setExtraHour(byte extraHour) {
        this.extraHour = extraHour;
    }

    public  double getbaseSalary(){
        return basaSalary + hourlyRate * extraHour;
    }
}
