package com.company;

import java.text.NumberFormat;

public class Car implements Comparable<Car> {
    private String carName;
    private int price;
    private int yearOfManufacture;
    private int soluong;
    private int compareAttribute;
//    private String paymentMethod;


    public Car() {
    }

    public Car(String carName, int price, int yearOfManufacture) {
        this.carName = carName;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
    }

    public Car(String carName, int price, int yearOfManufacture, int soluong) {
        this.carName = carName;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
        this.soluong = soluong;
    }

    @Override
    public int compareTo(Car o) {
        return compare(o, compareAttribute);
    }

    private int compare(Car o, int compareAttribute){
        if (compareAttribute == 1)
            return this.getYearOfManufacture()-o.getYearOfManufacture();
        else
            return this.getCarName().compareTo(o.getCarName());
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
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

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }


    public double totalMoney(){
        if (soluong >=2) {
            System.out.println("Chiết khấu giảm giá 2% khi mua 2 sản phẩm trở lên !!!");
            return (double) price * soluong * 98 / 100;
        }
        else
            System.out.println("Trả toàn bộ tiền !!!");
            return (double) price * soluong;
    }

    public double installmentPayment(){
        return (double) price * soluong * 30 / 100;
    }

    public double monthlyInterest(){
        return (double) price * soluong * 70 / 100 / 60;
    }


//    public String getPaymentMethod() {
//        return paymentMethod;
//    }
//
//    public void setPaymentMethod(String paymentMethod) {
//        this.paymentMethod = paymentMethod;
//    }

//    public double paymentMethods(){
//        if (paymentMethod.equals("Trả thẳng")){
//            if (soluong >=2) {
//                System.out.println("Chiết khấu giảm giá 2% khi mua 2 sản phẩm trở lên !!!");
//                return (double) price * soluong * 98 / 100;
//            }
//            else
//                System.out.println("Trả trực tiếp tiền mặt !!!");
//            return (double) price * soluong;
//        }else if (paymentMethod.equals("Trả góp")){
//            return (double) price * soluong * 30 / 100;
//        }
//        return (double) price * soluong * 70 / 100 / 60;
//    }
//


    public void setCompareAttribute(int compareAttribute) {
        this.compareAttribute = compareAttribute;
    }

    @Override
    public String toString(){
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return "Tên xe: " + carName + "\n" + "Năm sản xuất: " + yearOfManufacture + "\n" + "Đơn giá: " + formatter.format(price)
                + "\n" + ".............." + "\n" + "Tổng số tiền cần thanh toán: " + formatter.format(totalMoney()) + "\n..............\n"
                + "Hỗ trợ trả lên đến 70% giá trị xe với lãi suất 0% trong 5 năm !!!" + "\n"
                + "Số tiền cần thanh toán ban đầu: " + formatter.format(installmentPayment()) + "\n"
                + "Số tiền thanh toán mỗi tháng: " + formatter.format(monthlyInterest());
    }
}
