package com.company;

public class GameLogic {

    public static GamePlayer checkWinner(GamePlayer player1,
                                         GamePlayer player2){
        GamePlayer winner;
        //Nếu chọn đá, giá trị lựa chọn là 0;
        // chọn giấy, giá trị là 1;
        // chọn kéo, giá trị là 2.
        if (player1.getChoice() == player2.getChoice())
            return null;
        else {
            if (player1.getChoice() < player2.getChoice()){
                if (Math.abs(player2.getChoice() - player1.getChoice()) == 1)
                    winner = player2;
                else
                    winner = player1;
            }else {
                    if (Math.abs(player1.getChoice() - player2.getChoice()) == 1)
                        winner = player1;
                    else
                        winner = player2;
            }
        }
        winner.increaseScore();
        return winner;
    }
}
