package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        var browser = new Browser();
//        String content = browser.navigate("facebook.com.vn");

        var emp1 = new Employee("ABC",(byte)30);
        var emp2 = new Employee("ABC",(byte)30,true);
        System.out.println(emp1.getName());
        System.out.println(emp1.setAge());

    }
}
