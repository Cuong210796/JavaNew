package com.company;

import javax.swing.*;

public class CardNumber {
    /*"Ace-->K"
    Co Ro Tep Bich
    Sinh ra 1 số ngẫu nhiên từ 0 --> 52
    Kiểm tra số ngẫu nhiên này random
    Nếu random % 13 == 1 --> Ace
    Dư 12 --> Q, 11 -->J , 0 -->K, còn lại random số */

    private String number;

    public String getNumber() {
        return number;
    }

    public void setNumber() {
        int random = (int)(Math.random()*52)+1;
        if(random % 13 == 1)
            number = "Ace";
        else if (random % 13 == 12)
            number = "Q";
        else if (random % 13 == 11)
            number = "J";
        else if (random % 13 == 0)
            number = "K";
        else
            number =Integer.toString(random%13);
    }
}
