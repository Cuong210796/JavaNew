package com.company;

import java.util.Scanner;

public class InputNubmer {

        private  String lotteryNumber;
        private  String number;


    public void setUserName(String userName) {
        this.userName = userName;//setter sử dụng dữ liệu công khai
    }

    private String userName;

    public String getDateLottery() {
        return dateLottery;//getter lấy dữ liệu ra
    }
    private  String dateLottery;

        public String getLotteryNumber(){
            this.lotteryNumber = "" + (int)(Math.random()*10) +(int)(Math.random()*10);
            return  lotteryNumber;
        }

        public  String getNumber(){
            Scanner input = new Scanner(System.in);
            number = input.nextLine();
            return  number;
        }
}

