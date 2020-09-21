package com.company;

public class Stock {
    private String codeStock;
    private String nameStock;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock() {
        nameStock = "Công ty CP chứng khoán SSI";
        codeStock = "SSI";
    }
    public void getChangePercent(double previousClosingPrice,double currentPrice){
        double percent = (double) ((previousClosingPrice* 100.0f) / currentPrice);
        System.out.println(percent);
    }
    public void display() {
        System.out.println("Mã chứng khoán "+codeStock);
        System.out.println("Tên "+nameStock);
    }
}
