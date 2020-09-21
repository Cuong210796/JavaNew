package com.company;

public class Year {


    public Year(int year) {
        if ((year%4 == 0)&&(year%100 != 0)){
            System.out.println("La nam nhuan !");
        }
        else
            System.out.println("Khong phai nam nhuan !");
    }
}
