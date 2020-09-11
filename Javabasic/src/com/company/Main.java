package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        int income = 100000;
//        int age = 30;
//        boolean isEligible = income >90000 || age >30;
//        System.out.println("Accept:"+ isEligible);

//        Income HighIncome
//        className: First, Economy
//        boolean highIncome = false;
//        String className = (highIncome == true)?

//        switch (role){
//            case "admin":
//                System.out.println("Ban toan quyen");
//                break;
//            case "ád";
//            System.out.println('dsadsad');
//            break;

//        chia hết 5 in ra Fizz
//        chia hết 3 in ra Buzz
//        chia hết cả 3,5 in ra FizzBuzz
//        k chia hết in ra số ban đầu
//        Scanner sc = new Scanner(System.in);
//        int i = sc.nextInt();
//        if ((i%3==0) &&(i%5==0)){
//            System.out.println("FizzBuzz");
//        }
//        else if(i%3==0){
//            System.out.println("Buzz");
//        }else if(i%5==0){
//            System.out.println("Fizz");
//        }else
//            System.out.println(i);

        Scanner input = new Scanner(System.in);
        do {
            String mess = input.next();
            if (mess.equals("quit")){
                break;
            }  System.out.println("Ban vui long nhap 1 chuoi " + mess);
        }
        while (true);
    }
}
