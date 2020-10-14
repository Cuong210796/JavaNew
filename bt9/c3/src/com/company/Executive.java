package com.company;

public class Executive extends Employee {
    private double allowanceRate = 0.1;

    public Executive(String name, String address, String phone, String insurance, double manRate, int workingDays, double allowanceRate) {
        super(name, address, phone, insurance, manRate, workingDays);
        this.allowanceRate = allowanceRate;
    }

    @Override
    public int pay(){
        return (int)(super.fixedSalary()*allowanceRate+super.pay());
    }

}

