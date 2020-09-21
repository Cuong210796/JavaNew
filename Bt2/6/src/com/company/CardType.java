package com.company;

public class CardType {

    private String type;

    public String getType() {
        return type;
    }

    public void setType() {
        String[] suits = { "Cơ", "Rô", "Tép", "Bích" };
        type = suits[(int)(Math.random()*3)];
    }
}
