package com.company;

public class Volunteer extends StaffMember{
    public Volunteer(String name, String address, String phone, String insurance, double manRate, int workingDays) {
        super(name, address, phone, insurance, manRate, workingDays);
    }
    @Override
    public int pay(){
        return 0;
    }
}
