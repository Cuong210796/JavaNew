package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* 2. Viết chương trình cho phép nhập vào một số nguyên (từ 0 - 11) và kiểm tra năm đó là năm con gì.*/

        //Cách 1:
//        Scanner sc = new Scanner(System.in);
//        while (true){
//        System.out.println("Nhap 1 so tu 0 - 11 :");
//        int number = sc.nextInt();
//            if ((number >=0) && (number <= 11)) {
//        if (number == 0){
//            System.out.println("Tý");
//            break; //Có thể không dùng break để ktra liên tục
//        }
//        else if(number == 1){
//            System.out.println("Sửu");
//            break;
//        }
//        else if(number == 2){
//            System.out.println("Dần");
//            break;
//        }
//        else if(number == 3){
//            System.out.println("Mão");
//            break;
//        }
//        else if(number == 4){
//            System.out.println("Thìn");
//            break;
//        }
//        else if(number == 5){
//            System.out.println("Tỵ");
//            break;
//        }
//        else if(number == 6){
//            System.out.println("Ngọ");
//            break;
//        }
//        else if(number == 7){
//            System.out.println("Mùi");
//            break;
//        }
//        else if(number == 8){
//            System.out.println("Thân");
//            break;
//        }
//        else if(number == 9){
//            System.out.println("Dậu");
//            break;
//        }
//        else if(number == 10){
//            System.out.println("Tuất");
//            break;
//        }
//        else if(number == 11){
//            System.out.println("Hợi");
//            break;
//        }else
//        System.out.println("so khong hop le!");
//            }
//
//        }

        //Cách 2:
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so tu 0-11 : ");
        int number = input.nextInt();
        var number1 = new Condition(number);
    }
}
