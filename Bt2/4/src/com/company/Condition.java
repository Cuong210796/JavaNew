package com.company;

public class Condition {

    public Condition(double a, double b, double c) {
        if((a+b>c)&&(b+c>a)&&(c+a>b)){
        System.out.println("La 1 tam giac");
        double C = a+b+c;
        System.out.println("Chu vi tam giac = "+C);
    } else
        System.out.println("Khong phai tam giac");
    }
}
