package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var savingAccount = new SavingsAccount("01",100_000_000,0.12);
        var currentAccount = new CurrentAccount("02",100_000_000,10_000);
        var currentPlus = new CurrentPlusAccount("03",100_000_000,10_000,50_000_000,0.12);
        savingAccount.widthDraw(100_000);
        currentAccount.clearCheck(100_000);
        currentPlus.clearCheck(60_000_000);
        System.out.println(savingAccount.toString());
        System.out.println(currentAccount.toString());
        System.out.println(currentPlus.toString());
    }
}
