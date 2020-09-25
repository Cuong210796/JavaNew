package b2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so thu nhat : ");
        double s1 = input.nextDouble();
        System.out.println("Nhap so thu hai : ");
        double s2 = input.nextDouble();
        float s3 =(float)(s1/s2);

        if (s2 == 0){
            throw new Exception("Error!!!");
        }
        System.out.println(s3);
    }
}
