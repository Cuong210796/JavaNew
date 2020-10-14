package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var oneWayTicket = new OneWayTicket(180);
        var prepaidCard = new PrepaidCard(200);
        Line.A.enter(oneWayTicket);
        Line.D.exit(oneWayTicket);
        System.out.println(Line.D);
        System.out.println(prepaidCard);

    }
}
