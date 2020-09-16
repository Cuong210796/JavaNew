package com.company;

public class Employee {
    public  double basaSalary;
    public float hourlyRate;
    public byte extraHour;

    public  double getbaseSalary(){
        return basaSalary + hourlyRate * extraHour;
    }
}
