package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*7. Viết chương trình cho phép nhập vào từ bàn phím toạ độ x, y và chiều dài, chiều rộng
	 của hai hình chữ nhật, sau đó kiểm tra xem chúng giao nhau hay bọc lấy nhau hay nằm ngoài nhau.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap cac so nguyen x1,y1,w1,h1 :");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int w1= sc.nextInt();
        int h1 = sc.nextInt();
        System.out.println("nhap cac so nguyen x2,y2,w2,h2 :");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int w2 = sc.nextInt();
        int h2 = sc.nextInt();

        var rectangle1 = new Rectangle(x1, y1, w1, h1);
        var rectangle2 = new Rectangle(x2, y2, w2, h2);

        String result = Condition.rectangleCompare(rectangle1, rectangle2);
        System.out.println(result);
    }
}
