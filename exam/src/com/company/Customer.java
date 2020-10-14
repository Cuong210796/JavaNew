package com.company;

public class Customer {
    private String customer;
    private String phoneNumber;



    public String getCustomer() {
        return customer;
    }

    public Customer(String customer, String phoneNumber) {
        this.customer = customer;
        this.phoneNumber = phoneNumber;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    @Override
    public String toString(){
        return "Tên khách hàng: " + customer + "\t" + "Số điện thoại: " + phoneNumber;
    }
}
