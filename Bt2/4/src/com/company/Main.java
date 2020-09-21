package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*4. Viết chương trình cho phép đọc nhập từ bàn phím độ dài 3 cạnh của một tam giác và tính chu vi nếu
	độ dài 3 cạnh là hợp lệ. Độ dài 3 cạnh tam giác là hợp lệ nếu tổng độ dài 2 cạnh bất kỳ lớn hơn cạnh còn lại.*/

        //Cách 1:
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap gia tri 3 canh : ");
//        double a = sc.nextDouble();
//        double b = sc.nextDouble();
//        double c = sc.nextDouble();
//    if((a+b>c)&&(b+c>a)&&(c+a>b)){
//        System.out.println("La 1 tam giac");
//        double C = a+b+c;
//        System.out.println("Chu vi tam giac = "+C);
//    }
//    else
//        System.out.println("Khong phai tam giac");

    //Cách 2:
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap gia tri 3 canh : ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        Condition tg = new Condition(a,b,c);

    }
}
