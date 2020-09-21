package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*5. Viết chương trình cho phép nhập từ bàn phím một điểm có toạ độ (x, y) và kiểm tra xem điểm đó
	có nằm trong hay nằm ngoài hình chữ nhật có tâm tại (0, 0) và có độ dài là 10 và có chiều rộng là 5.*/

        //Cách 1:

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào hoành độ tâm O: ");
        double hoanhDo = sc.nextDouble();
        System.out.println("Nhập vào tung độ tâm O: ");
        double tungDo = sc.nextDouble();
//        if (((Math.abs(hoanhDo)<=5)&&(Math.abs(tungDo)<=2.5))||((Math.abs(hoanhDo)<=2.5)&&(Math.abs(tungDo)<=5))){
//            System.out.println("Diem do nam trong HCN ");
//        }
//        else
//            System.out.println("Diem do nam ngoai HCN");

        //Cách 2:
        var hcn = new Condition(hoanhDo,tungDo);



    }
}
