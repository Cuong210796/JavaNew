package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*cau 10:
         Viết chương trình xổ số Lottery.java, có chức năng sinh ra số ngẫu nhiên (lottery number) có 2 chữ số,
          yêu cầu user nhập vào số có 2 chữ số và kiểm tra xem user có thắng giải không dựa theo luật sau đây:
        a. Nếu số user nhập vào giống hoàn toàn lottery number thì giải thưởng là 10000
        b. Nếu các chữ số trong số của user nhập vào giống các chữ số của lottery number thì giải thưởng là 3000
        c. Nếu chỉ 1 chữ số trong số user nhập vào giống với 1 trong các chữ số của lottery number thì giải thưởng là 1000*/

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int rd_int1 = rd.nextInt(10);
        int rd_int2 = rd.nextInt(10);



        System.out.println("Nhap so co 2 chu so bat ky ");
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        if (input1 == rd_int1 && input2 == rd_int2){
            System.out.println("Random Integers: "+rd_int1 + rd_int2);
            System.out.println("Bạn đã trúng giải thưởng 10000");
        }
        else if(input1==rd_int2 && input2 == rd_int1){
            System.out.println("Random Integers: "+rd_int1 + rd_int2);
            System.out.println("Bạn đã trúng giải thưởng 3000");
        }
        else if(input1 == rd_int1 || input2 == rd_int2 || input1==rd_int2 || input2 == rd_int1){
            System.out.println("Random Integers: "+rd_int1 + rd_int2);
            System.out.println("Bạn đã trúng giải thưởng 1000");
        }else {
            System.out.println("Random Integers: "+rd_int1 + rd_int2);
            System.out.println("Chúc bạn may mắn lần sau!");
        }
    }
}
