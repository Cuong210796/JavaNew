package com.company;

public class Car extends Trademark {
    private String carName;
    private int price;

//    public Car() {
//    }

    public Car(String carName, int price, String trade) {
        super(trade);
        this.carName = carName;
        this.price = price;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Hãng xe: " + getNameTrademark() + "\n" + "Loại xe: " + this.carName + "\n" + "Giá xe: " + getPrice();
    }
}
