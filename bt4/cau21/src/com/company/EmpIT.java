package com.company;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class EmpIT {
    private int date;
    private int month;
    private int year;
    Scanner input = new Scanner(System.in);
    public void day(){
//        System.out.println("nhap ngay thang nam sinh ");
//        int date = input.nextInt();
//        int month = input.nextInt();
//        int year = input.nextInt();
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, date);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.YEAR, year);
        Date myBirthday = calendar.getTime();
        String dayOfWeek = new SimpleDateFormat("EEEE").format(myBirthday);

        System.out.println(dayOfWeek);
    }
}
