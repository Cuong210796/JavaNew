package com.company;

import java.text.DecimalFormat;

public class Car extends Trademark {
    private String carName;
    private int price;
    private int soluong;
//    private double discount = 0.98;

    public Car() {
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public Car(String nameTrademark) {
        super(nameTrademark);
    }

    public Car(String carName, int price, int soluong) {
        this.carName = carName;
        this.price = price;
        this.soluong = soluong;
    }

    public Car(String nameTrademark, String carName, int price,int soluong) {
        super(nameTrademark);
        this.carName = carName;
        this.price = price;
        this.soluong = soluong;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

//    public double getDiscount() {
//        return discount;
//    }
//
//    public void setDiscount(double discount) {
//        this.discount = discount;
//    }

    public double totalMoney() {
        if (soluong<2) {
            return (double) price * soluong;
        }else
            return (double)price*soluong*98/100;
    }



    @Override
    public String toString() {
        DecimalFormat formatter = new DecimalFormat("###,###,### VNĐ");
        return "Hãng xe: " + getNameTrademark() + "\n" + "Loại xe: " + this.carName + "\n" + "Giá xe: " +  formatter.format(getPrice()) + "\n" + "Số lượng: " + this.soluong;
    }
}
