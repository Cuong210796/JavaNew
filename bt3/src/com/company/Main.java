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

//        Scanner sc = new Scanner(System.in);
//        Random rd = new Random();
//        int rd_int1 = rd.nextInt(10);
//        int rd_int2 = rd.nextInt(10);
//
//
//
//        System.out.println("Nhap so co 2 chu so bat ky ");
//        int input1 = sc.nextInt();
//        int input2 = sc.nextInt();
//        if (input1 == rd_int1 && input2 == rd_int2){
//            System.out.println("Random Integers: "+rd_int1 + rd_int2);
//            System.out.println("Bạn đã trúng giải thưởng 10000");
//        }
//        else if(input1==rd_int2 && input2 == rd_int1){
//            System.out.println("Random Integers: "+rd_int1 + rd_int2);
//            System.out.println("Bạn đã trúng giải thưởng 3000");
//        }
//        else if(input1 == rd_int1 || input2 == rd_int2 || input1==rd_int2 || input2 == rd_int1){
//            System.out.println("Random Integers: "+rd_int1 + rd_int2);
//            System.out.println("Bạn đã trúng giải thưởng 1000");
//        }else {
//            System.out.println("Random Integers: "+rd_int1 + rd_int2);
//            System.out.println("Chúc bạn may mắn lần sau!");
//        }
//        Scanner sc = new Scanner(System.in);
//        Random rd = new Random();
//        int low = 10;
//        int high = 100;
//        int result = rd.nextInt(high-low) + low;
//        int donvi1 = result*10;
//        int chuc1 = result/10;
//        System.out.println(result);
//
//
//        System.out.println("nhap so bat ky co 2 chu so : ");
//        int input = sc.nextInt();
//        int donvi = input*10;
//        int chuc = input/10;
//        if (donvi == donvi1 && chuc == chuc1){
//            System.out.println(result);
//            System.out.println("Bạn đã trúng giải thưởng 10000");
//        }
//        else if(donvi==chuc1 && donvi1 == chuc){
//            System.out.println(result);
//            System.out.println("Bạn đã trúng giải thưởng 3000");
//        }
//        else if(donvi == donvi1 || chuc == chuc1 || donvi==chuc1 || donvi1 == chuc){
//            System.out.println(result);
//            System.out.println("Bạn đã trúng giải thưởng 1000");
//        }else {
//            System.out.println(result);
//            System.out.println("Chúc bạn may mắn lần sau!");
//        }

var input = new  InputNubmer();
var lotteryCheck = new LottoryChecknumber();

var lotteryNumber= input.getLotteryNumber();
var number= input.getNumber();
var award = lotteryCheck.getAward(lotteryNumber, number);

var display = new DisplayAward();
display.printLottery(lotteryNumber);
display.printAward(award);

    }
}
