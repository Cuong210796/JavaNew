package com.company;

public abstract class  Account {
    private String id;
    private  double balance;

    public Account(String id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public abstract double monthlyInterest();

    public void deposit(double amount){
        balance += amount;
    }

     public  void  deduct(double amount){
        if (balance<amount) {
            throw new IllegalArgumentException("So du khong du !!!");
        }
        balance -= amount;
     }

    public String getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }
}
