package com.company;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
	// write your code here
        DecimalFormat formatter = new DecimalFormat("###,###,###.00");
        var car1 = new Car("Honda","CRV",1_000_000_000,2);
        var customer1 = new Customer("cuong","0945978003");
//        var direct = new DirectPayment();
//        var online = new OnlinePayment();
        car1.totalMoney();
//        direct.payment();

        System.out.println(customer1.toString()+ "\n" + car1.toString() + " \n" + "Tổng giá số tiền hóa đơn: " + car1.totalMoney() + "\n" );

    }
}
