package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        var st1 = new GenericList<Student>(5);
//            st1.add(new Student(7));
//            st1.add(new Student(10));
//            int pointDiff = st1.get(0).compareTo(st1.get(1));
//            System.out.println(pointDiff);

        var keyValue1 = new  KeyValuePair<String, Integer>("Cuong1",24);
        var keyValue2 = new  KeyValuePair<String, String>("Cuong2","30");

        Utilities.printUser("ID", 100);
    }
}
