package com.company;

public class OANTT {
    private String K;
    private String B;
    private String O;
    private String bot;
    private String user;

//    public String getBot() {
//        return bot;
//    }

    public void getBot() {
        String[] pr ={"K","B","O"};
        bot = pr[(int)(Math.random()*2)];
        System.out.println(bot);
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int checkUser() {
        if (user.equals(bot)) {
            return 0;
        } else if (user.equals("B") && bot.equals("K")) {
            return 1;
        } else if (user.equals("B") && bot.equals("O")) {
            return -1;
        } else if (user.equals("K") && bot.equals("B")) {
            return -1;
        } else if (user.equals("K") && bot.equals("O")) {
            return 1;
        } else if (user.equals("O") && bot.equals("B")) {
            return 1;
        } else if (user.equals("O") && bot.equals("K")) {
            return -1;
        }
        return  0;
    }
}
