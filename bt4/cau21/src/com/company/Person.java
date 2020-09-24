package com.company;


import java.util.Scanner;

public class Person {
    private String name;
    private String birthday;
    //protected
    public Person(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public Person() {

    }

//    public void nhap(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập tên: ");
//        name = sc.nextLine();
//        System.out.println("Nhập ngay tháng năm sinh(DD/MM/YYYY: ");
//        birthday = sc.nextLine();
//        String[] birthdays = birthday.split("[/-]");
//        Date d = new Date(
//                Integer.parseInt(birthdays[0]),Integer.parseInt(birthdays[1]),Integer.parseInt(birthdays[2]));
//        d.date();
//    }
// (nhap ngày thành thứ)

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return ( name + birthday);
    }
}
