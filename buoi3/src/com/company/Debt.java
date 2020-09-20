package com.company;

import java.util.Scanner;


public class Debt {
    final byte MONTHS_OF_YEAR =12;
    final byte PERCENT = 100;

    private double L;//so tien vay
    private double c ;//so lai 1 thang /12/100
    private double n ;// so ky *12


    public Debt(double L,double c,double n) {
        this.L = L;
        this.c = c;
        this.n = n;
    }

    public void setL(double l) {
        L = l;
    }

    public void print() {
        for(int p=1;p<=n;p++){
            double result =  L * (Math.pow((1 + c),n) - Math.pow((1 + c),p)) / (Math.pow((1 + c), n) - 1);
            System.out.println(result);
        }
    }

}
