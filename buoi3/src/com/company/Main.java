package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        TextBox textBox1 = new TextBox();
//        textBox1.setText("Hello World");
//        System.out.println(textBox1.text);
//
//        TextBox textBox2 = new TextBox();
//        textBox2.setText("Hi");
//        System.out.println(textBox2.text);

//    var employee1 = new Employee(); // để var thay Employee để java tự tìm đến class Employee
//    employee1.setBasaSalary(100_000);
//    employee1.setHourlyRate(50_000);
//    employee1.setExtraHour((byte) 12);
//
//        System.out.println(employee1.getbaseSalary());




        Scanner sc = new Scanner(System.in);
        System.out.println("nhap L ");
        double principle = sc.nextDouble();
        System.out.println("nhap c ");
        double rate = sc.nextDouble();
        System.out.println("nhap n ");
        double periods = sc.nextDouble();

        var debt1 = new Debt(principle, rate, periods);
        debt1.print();

    }
}