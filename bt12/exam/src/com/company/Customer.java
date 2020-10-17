package com.company;

public class Customer {
    private String nameCustomer;
    private String phone;

    public Customer(String nameCustomer, String phone) {
        this.nameCustomer = nameCustomer;
        this.phone = phone;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Tên khách hàng: " + this.nameCustomer + "\n" + "Số điện thoại: " + this.phone;
    }
}
