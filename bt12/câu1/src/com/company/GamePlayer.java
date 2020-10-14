package com.company;

public class GamePlayer extends Player {
    private int choice; // cài đặt lựa chọn theo 012 đá kéo bao

    public GamePlayer(String name) {
        super(name);
    }

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }
    public void increaseScore(){
        setScore(getScore() + 1);
    }
}
