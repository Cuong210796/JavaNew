package com.company;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ten khach hang: ");
        String nameCustomer = input.nextLine();
        System.out.println("Nhap so dien thoai khach hang: ");
        String phone = input.nextLine();
        System.out.println("Nhap so luong muon mua: ");
        int soluong = input.nextInt();




        var mecC = new MercedesC();
        mecC.add(new Car("Mercedes C180",60_365,2020,soluong));
        mecC.add(new Car("Mercedes C200",64_680,2020,soluong));
        mecC.add(new Car("Mercedes C200 Exclusive",74_605,2020,soluong));
        mecC.add(new Car("Mercedes C200 Cabriolet",120_815,2020,soluong));
        mecC.add(new Car("Mercedes C300 AMG",83_665,2020,soluong));

        var mecE = new MercedesE();
        mecE.add(new Car("Mercedes E180",88_455,2020,soluong));
        mecE.add(new Car("Mercedes E200",91_905,2020,soluong));
        mecE.add(new Car("Mercedes E200 Exclusive",98_800,2020,soluong));
        mecE.add(new Car("Mercedes E200 Sport",100_000,2020,soluong));
        mecE.add(new Car("Mercedes E300 AMG",126_000,2020,soluong));

        var mecS = new MercedesS();
        mecS.add(new Car("Mercedes S450 L",185_495,2020,soluong));
        mecS.add(new Car("Mercedes S450 L Luxury",214_405,2020,soluong));
        mecS.add(new Car("Mercedes Maybach S450 4Matic",322_275,2020,soluong));
        mecS.add(new Car("Mercedes Maybach S560 4Matic",478_905,2020,soluong));
        mecS.add(new Car("Mercedes Maybach S650",642_870,2020,soluong));

        var mecGLC = new MercedesGLC();
        mecGLC.add(new Car("Mercedes GLC200",75_465,2020,soluong));
        mecGLC.add(new Car("Mercedes GLC200 4MATIC",87_980,2020,soluong));
        mecGLC.add(new Car("Mercedes GLC 300 (CKD)",103_515,2020,soluong));
        mecGLC.add(new Car("Mercedes GLC 300 4MATIC Coupe",132_420,2020,soluong));
        mecGLC.add(new Car("Mercedes AMG GLC 43 4MATIC",155_290,2020,soluong));




        var cus = new Customer(nameCustomer,phone);
//        System.out.println(cus + "\n" + "Thông tin các xe khách chọn mua: " + "\n" + mecE.search("E300")
//                + "\n và \n" +mecC.search("C200"));
        System.out.println("....................");
        System.out.println(mecC.sort(1));// lấy ra sp mecE
        System.out.println("....................");
        System.out.println(cus + "\n" + ".............."  + "\n" + "Thông tin xe khách hàng chọn mua: " + "\n" + "Số lượng mua: " + soluong + "\n" + mecE.search("E300"));
    }
}
