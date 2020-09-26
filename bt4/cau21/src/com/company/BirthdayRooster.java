package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class BirthdayRooster {
    public static void main(String[] args) throws ParseException {
        var employee1 = new Employee("IT","Cuong1","22/09/2020");
        var employee2 = new Employee("IT","Cuong2","23/09/2020");
        var date1 = new Date();
        String bd = date1.newBirthDay(employee1.getBirthday());
        employee1.setBirthday(employee1.getBirthday() + " (" + bd + ")");
        System.out.println(employee1.toString());
        String bd1 = date1.newBirthDay(employee2.getBirthday());
        employee2.setBirthday(employee2.getBirthday() + " (" + bd + ")");
        System.out.println(employee2.toString());
// static là phương thức của lớp không phải của đối tượng
    }

}
