package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class BirthdayRooster {
    public static void main(String[] args) throws ParseException {
        var employee = new Employee(1,"IT","Cuong","22/09/2020");
        var date1 = new Date();
        String bd = date1.newBirthDay(employee.getBirthday());
        employee.setBirthday(employee.getBirthday() + " (" + bd + ")");
        System.out.println(employee.toString());
// static là phương thức của lớp không phải của đối tượng
    }

}
