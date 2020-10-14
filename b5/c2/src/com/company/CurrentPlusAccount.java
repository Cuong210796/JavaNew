package com.company;

public class CurrentPlusAccount extends CurrentAccount {
    private final double MONTH_IN_YEAR = 12.0;
    private double minimumBalance;
    private double annualInterest;

    public CurrentPlusAccount(String id, double balance, double charge, double minimumBalance, double annualInterest) {
        super(id, balance, charge);
        this.annualInterest = annualInterest;
        this.minimumBalance = minimumBalance;
    }


    public double monthlyInterest() {
        if (getBalance() >= minimumBalance) {
            return getBalance() * annualInterest / MONTH_IN_YEAR;
        }else
        return 0;
    }
}
