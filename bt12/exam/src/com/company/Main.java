package com.company;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ten khach hang: ");
        String nameCustomer = input.nextLine();
        System.out.println("Nhap so dien thoai khach hang: ");
        String phone = input.nextLine();
        System.out.println("Nhap hang xe: ");
        String carName = input.nextLine();
        System.out.println("Nhap loai xe: ");
        String trade = input.nextLine();
        System.out.println("Nhap don gia: ");
        int price = input.nextInt();

        var car = new Car(carName,price,trade);
        var cus = new Customer(nameCustomer,phone);
        System.out.println(cus + "\n" + car.toString() + "\n" );
    }
}
