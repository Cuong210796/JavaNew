package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*7. Viết chương trình cho phép nhập vào từ bàn phím toạ độ x, y và chiều dài, chiều rộng
	 của hai hình chữ nhật, sau đó kiểm tra xem chúng giao nhau hay bọc lấy nhau hay nằm ngoài nhau.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap toa do x1 cua HCN1 = ");
        double x1 = sc.nextDouble();
        System.out.println("Nhap toa do y1 cua HCN1 = ");
        double y1 = sc.nextDouble();
        System.out.println("Nhap chieu dai cua HCN1 = ");
        double d1 = sc.nextDouble();
        System.out.println("Nhap chieu rong cua HCN1 = ");
        double r1 = sc.nextDouble();
        System.out.println("Nhap toa do x2 cua HCN2 = ");
        double x2 = sc.nextDouble();
        System.out.println("Nhap toa do y2 cua HCN2 = ");
        double y2 = sc.nextDouble();
        System.out.println("Nhap chieu dai cua HCN2 = ");
        double d2 = sc.nextDouble();
        System.out.println("Nhap chieu rong cua HCN2 = ");
        double r2 = sc.nextDouble();
        if ((x1+r1>=x2)&&(x2+r2>=x1)&&(y1+d1>=y2)&&(y2+d2>=y1)){
         System.out.println("2 HCN giao nhau");
        }
        else {
            System.out.println("2 HCN không giao nhau");
        }
    }
}
