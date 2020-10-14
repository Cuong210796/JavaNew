package com.company;

public class OnlinePayment{
    private Car car;

    public OnlinePayment() {
    }

    public OnlinePayment(Car car) {
        this.car = car;
    }

    public int totalPayment(){
        return car.getPrice() - car.getPrice()*2/100;
    }
}
