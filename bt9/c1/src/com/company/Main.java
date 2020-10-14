package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        var acc = new SavingAccount("cuong",1,100_000);
//        var acc1 = new SavingAccount("cuong",1,100_000,1);
        try {
//            acc.add(30_000);
            acc.tienLaiThang(0.5);
        }catch (Exception exception){
            System.out.println("nhap lai so tien rut !!!");
        }
        System.out.println(acc);
    }
}
