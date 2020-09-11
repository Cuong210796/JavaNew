package com.company;


import java.util.Random;

public class Main {

    public static void main(String[] args) {
	/*6. Viết chương trình mô phỏng việc lấy ngẫu nhiên một lá bài từ bộ bài 52 lá và
	chương trình phải hiển thị lá bài đó là lá bài gì. Ví dụ đầu ra của chương trình như sau:
      "Lá bài bạn vừa rút ra là Q cơ"*/
       Random rd = new Random();
         String[] suits = { "Cơ", "Rô", "Tép", "Bích" };
         String[] ranks = { "Ace","2" ,"3","4","5","6","7","8" ,"9","10" ,"J" ,"Q","K" };
        String random1 = suits[(int)(Math.random()*3)];
        String random2 = ranks[(int)(Math.random()*12)];
//        char t = random.charAt ((int)(Math.random()*(random.length() -1))); nếu có nhiều trong string
        System.out.println("Lá bài bạn vừa rút ra là "+random2+" "+random1);
    }
}
