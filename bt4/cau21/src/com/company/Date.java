package com.company;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
//import java.util.Date;
public class Date {


    public String newBirthDay(String birthday) throws ParseException, ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date date = simpleDateFormat.parse(birthday);
        SimpleDateFormat simpleDateformat1 = new SimpleDateFormat("EEEE"); // the day of the week spelled out completely
        String dayOfWeek = simpleDateformat1.format(date);
        System.out.println(dayOfWeek);
        return dayOfWeek;
    }
}
