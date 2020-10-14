package com.company;

public class Hourly extends StaffMember {
    public Hourly(String name, String address, String phone, String insurance, double manRate, int workingDays) {
        super(name, address, phone, insurance, manRate, workingDays);
    }
    @Override
    public  int pay(){
        return (int)(getManRate()*getWorkingDays());
    }
    @Override
    public String toString(){
        return "name: "+getName() +"\n"
                +"address: "+getAddress()+"\n"
                +"phone: "+getPhone()+"\n"
                +"isurace: "+getInsurance()+"\n"
                +"workingDays: "+getWorkingDays()+"\n"
                +"income: "+pay();
    }
}
