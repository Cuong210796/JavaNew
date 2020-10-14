package com.company;

import java.text.NumberFormat;

public class SavingsAccount extends Account {
    private final double MONTH_IN_YEAR = 12.0;
    private  double annualInterest;


    public SavingsAccount(String id, double balance, double annualInterest) {
        super(id, balance);
        this.annualInterest = annualInterest;
    }

    public  void  widthDraw(double amount){
        deduct(amount);
    }

    @Override
    public double monthlyInterest() {
        return getBalance()*annualInterest/MONTH_IN_YEAR;
    }

    public  String toString(){
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return getId() + "\t" +formatter.format(getBalance())+ "\t" + formatter.format(monthlyInterest());
    }

}
