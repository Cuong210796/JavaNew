package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
               /* 1. Viết chương trình cho phép nhập một năm từ bàn
                phím và kiểm tra + in ra năm đó có phải năm nhuận hay không */

        //Cách 1:
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Viet 1 nam bat ky : ");
//        int year = sc.nextInt();
//        if ((year%4 == 0)&&(year%100 != 0)){
//            System.out.println("La nam nhuan !");
//        }
//        else
//            System.out.println("Khong phai nam nhuan !");

        //Cách 2:
        Scanner input = new Scanner(System.in);
        System.out.println("Viet 1 nam bat ky : ");
        int year = input.nextInt();
        var year1 = new Year(year);
    }
}
