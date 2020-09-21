package com.company;

public class Condition {
    public Condition(double hoanhDo, double tungDo) {
        if (((Math.abs(hoanhDo)<=5)&&(Math.abs(tungDo)<=2.5))||((Math.abs(hoanhDo)<=2.5)&&(Math.abs(tungDo)<=5))){
            System.out.println("Diem do nam trong HCN ");
        }
        else
            System.out.println("Diem do nam ngoai HCN");
    }
}
