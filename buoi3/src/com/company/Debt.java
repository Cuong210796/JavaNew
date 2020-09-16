package com.company;

public class Debt {
    final byte MONTHS_OF_YEAR =12;
    final byte PERCENT = 100;
    public double L;//so tien vay
    public double c ;//so lai 1 thang
    public double n ;// so ky
    public double p;// so ky da tra

    public double B() {
        return  L * (Math.pow((1 + c),n) - Math.pow((1 + c),p)) / (Math.pow((1 + c), n) - 1);
  for(int p=1;p<=n;p++){
            double B(c,n,p,L);

    }
}
}
