package com.company;

import java.util.Scanner;


public class Debt {
    final byte MONTHS_OF_YEAR =12;
    final byte PERCENT = 100;

    public double L;//so tien vay
    public double c ;//so lai 1 thang /12/100
    public double n ;// so ky *12
    public double p;// so ky da tra *12


    public double B() {
        return  L * (Math.pow((1 + c),n) - Math.pow((1 + c),p)) / (Math.pow((1 + c), n) - 1);
    }
        public Debt(double L,double c,double n,double p){
            this.L=L;
            this.c=c;
            this.n=n;
            this.p=p;
        for(int i=1;i<=n;i++){
          B();
    }
}
}
