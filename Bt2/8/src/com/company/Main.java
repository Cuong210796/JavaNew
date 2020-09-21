package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*Viết chương trình đoán ngày sinh nhật. Bạn đưa ra cho bạn mình 5 tập số và hỏi 5 câu hỏi xem ngày sinh của
	 bạn mình có thuộc 1 trong 5 tập số sau đây hay ko. Ví dụ ngày sinh nhật có trong set 1, set 2, set 5 thì
	 ngày sinh nhật sẽ là 19 như hình bên dưới (ngày sinh nhật chính là tổng của con số đầu tiên
	 của các set mà ngày sinh nhật thuộc set đó)*/
        //Cách 1:

//        String set1 = "1 3 5 7\n"+"9 11 13 15\n"+"17 19 21 23\n"+"25 27 29 31";
//        String set2 = "2 3 6 7\n"+"10 11 14 15\n"+"18 19 22 23\n"+"26 27 30 31";
//        String set3 = "4 5 6 7\n"+"12 13 14 15\n"+"20 21 22 23\n"+"28 29 30 31";
//        String set4 = "8 9 10 11\n"+"12 13 14 15\n"+"24 25 26 27\n"+"28 29 30 31";
//        String set5 ="16 17 18 19\n"+"20 21 22 23\n"+"24 25 26 27\n"+"28 29 30 31";
//
//        int day = 0;
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Có phải sinh nhật bạn nằm trong set1?\n");
//        System.out.println(set1);
//        System.out.println("Chọn 1 nếu đúng và chọn 0 nếu sai : ");
//        int answer = input.nextInt();
//        if (answer == 1)
//            day +=1;
//
//        System.out.println("Có phải sinh nhật bạn nằm trong set2?\n");
//        System.out.println(set2);
//        System.out.println("Chọn 1 nếu đúng và chọn 0 nếu sai : ");
//        answer = input.nextInt();
//        if (answer == 1)
//            day +=2;
//
//        System.out.println("Có phải sinh nhật bạn nằm trong set3?\n");
//        System.out.println(set3);
//        System.out.println("Chọn 1 nếu đúng và chọn 0 nếu sai : ");
//        answer = input.nextInt();
//        if (answer == 1)
//            day +=4;
//
//        System.out.println("Có phải sinh nhật bạn nằm trong set4?\n");
//        System.out.println(set4);
//        System.out.println("Chọn 1 nếu đúng và chọn 0 nếu sai : ");
//        answer = input.nextInt();
//        if (answer == 1)
//            day +=8;
//
//        System.out.println("Có phải sinh nhật bạn nằm trong set5?\n");
//        System.out.println(set5);
//        System.out.println("Chọn 1 nếu đúng và chọn 0 nếu sai : ");
//        answer = input.nextInt();
//        if (answer == 1)
//            day +=16;
//
//        System.out.println("Sinh nhật của bạn là ngày "+day+"!");

        //Cách 2:
        Scanner input = new Scanner(System.in);
        var day = 0;

        var set1 = new  Set((byte)1);
        var set2 = new  Set((byte)2);
        var set3 = new  Set((byte)4);
        var set4 = new  Set((byte)8);
        var set5 = new  Set((byte)16);

        System.out.println("Có phải sinh nhật bạn nằm trong set1?\n");
        System.out.println(set1.getSet());
        System.out.println("Chọn 1 nếu đúng và chọn 0 nếu sai : ");
        int answer = input.nextInt();
        if (answer == 1)
            day +=set1.getFirstNumber();

        System.out.println("Có phải sinh nhật bạn nằm trong set2?\n");
        System.out.println(set2.getSet());
        System.out.println("Chọn 1 nếu đúng và chọn 0 nếu sai : ");
        answer = input.nextInt();
        if (answer == 1)
            day +=set2.getFirstNumber();

        System.out.println("Có phải sinh nhật bạn nằm trong set3?\n");
        System.out.println(set3.getSet());
        System.out.println("Chọn 1 nếu đúng và chọn 0 nếu sai : ");
        answer = input.nextInt();
        if (answer == 1)
            day +=set3.getFirstNumber();

        System.out.println("Có phải sinh nhật bạn nằm trong set4?\n");
        System.out.println(set4.getSet());
        System.out.println("Chọn 1 nếu đúng và chọn 0 nếu sai : ");
        answer = input.nextInt();
        if (answer == 1)
            day +=set4.getFirstNumber();

        System.out.println("Có phải sinh nhật bạn nằm trong set5?\n");
        System.out.println(set5.getSet());
        System.out.println("Chọn 1 nếu đúng và chọn 0 nếu sai : ");
        answer = input.nextInt();
        if (answer == 1)
            day +=set5.getFirstNumber();

        System.out.println("Sinh nhật của bạn là ngày "+day+"!");
    }
}
