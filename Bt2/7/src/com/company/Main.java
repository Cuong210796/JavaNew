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
        if ((x1==x2) && (y1==y2)){
            if ((d1<=d2)&&(r1<=r2)){
                System.out.println("HCN2 bọc HCN1");
            }
            else if((d2<=d1)&&(r2<=r1)){
                System.out.println("HCN1 bọc HCN2");
            }
        }
    }
}
