package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*3. Viết chương trình sinh ra một số ngẫu nhiên (từ 1 - 12) và in ra tháng tương ứng với số đó
                (ví dụ 1 thì in ra "tháng một", 2 thì in ra "tháng hai")*/

        //Cách 1:
//        Scanner sc = new Scanner(System.in);
//        while (true){
//            System.out.println("Nhap 1 so tu 0 - 11 :");
//            int number = sc.nextInt();
//            if ((number >=1) && (number <= 12)) {
//                if (number == 1){
//                    System.out.println("Tháng Một");
//                    break; //Có thể không dùng break để ktra liên tục
//                }
//                else if(number == 2){
//                    System.out.println("Tháng Hai");
//                    break;
//                }
//                else if(number == 3){
//                    System.out.println("Tháng Ba");
//                    break;
//                }
//                else if(number == 4){
//                    System.out.println("Tháng Tư");
//                    break;
//                }
//                else if(number == 5){
//                    System.out.println("Tháng Năm");
//                    break;
//                }
//                else if(number == 6){
//                    System.out.println("Tháng Sáu");
//                    break;
//                }
//                else if(number == 7){
//                    System.out.println("Tháng Bảy");
//                    break;
//                }
//                else if(number == 8){
//                    System.out.println("Tháng Tám");
//                    break;
//                }
//                else if(number == 9){
//                    System.out.println("Tháng Chín");
//                    break;
//                }
//                else if(number == 10){
//                    System.out.println("Tháng Mười");
//                    break;
//                }
//                else if(number == 11){
//                    System.out.println("Tháng Mười Một");
//                    break;
//                }
//                else if(number == 12){
//                    System.out.println("Tháng Mười Hai");
//                    break;
//                }
//            }
//
//        }

        //Cách 2:
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap 1 so tu 1 - 12 :");
            int number = input.nextInt();
            var number1 =  new Condition(number);
    }
}
