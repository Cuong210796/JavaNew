package com.company;

import java.util.Random;
import java.util.Scanner;

public class OANTT {
    private String K;
    private String B;
    private String O;
    private String bot;
    private String user;

    public String getBot() {
        return bot;
    }

    public void setBot() {
        String[] pr ={"K","B","O"};
        bot = pr[(int)(Math.random()*2)];
        System.out.println(bot);
    }

    public String getUser() {
        return user;
    }

    public void setUser() {
        if (user == bot){
            System.out.println("Hòa");
        }
        else if(user == "B" && bot == "K"){
            System.out.println("Bạn thắng");
        }
        else if(user == "B" && bot == "O"){
            System.out.println("Bạn thua");;
        }
        else if(user == "K" && bot == "B"){
            System.out.println("Bạn thua");;
        }
        else if(user == "K" && bot == "O"){
            System.out.println("Bạn thắng");;
        }
        else if(user == "O" && bot == "B"){
            System.out.println("Bạn thăng");;
        }
        else if(user == "O" && bot == "K"){
            System.out.println("Bạn thua");;
        }
    }

}
