package com.company;

public class Employee extends StaffMember{
    private  double award;

    public Employee(String name, String address, String phone, String insurance, double manRate, int workingDays) {
        super(name, address, phone, insurance, manRate, workingDays);
    }
    @Override
    public int pay(){
        return (int)(getManRate()*getWorkingDays()+award);
    }

    public int fixedSalary(){
        return (int)(getManRate()*getWorkingDays());
    }

    public void setAward(double award) {
        this.award = award;
    }
}
