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
//    employee1.basaSalary = 10_000_000;
//    employee1.hourlyRate = 200_000;
//    employee1.extraHour = 12;
//
//        System.out.println(employee1.getbaseSalary());



        var debt1 = new Debt(100000,0.05,50,20);
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap L ");
        debt1.L = sc.nextDouble();
        System.out.println("nhap c ");
        debt1.c = sc.nextDouble();
        System.out.println("nhap n ");
        debt1.n = sc.nextDouble();
        System.out.println("nhap p ");
        debt1.p = sc.nextDouble();

        System.out.println(debt1.B());

    }
}