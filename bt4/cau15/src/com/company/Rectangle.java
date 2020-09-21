package com.company;

import java.util.Scanner;

public class Rectangle {
    public double height, width;
//    public void getInformation(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Chieu dai HCN :");
//        height = sc.nextDouble();
//        System.out.println("Chieu rong HCN :");
//        width = sc.nextDouble();
//    }
    public double getArea(){
        return height * width;
    }
    public double getPerimeter(){
        return (height + width)*2;
    }
    public void display(){
        System.out.println("Dien tich HCN : " + getArea());
        System.out.println("Chu vi HCN : " + getPerimeter());
    }
}
