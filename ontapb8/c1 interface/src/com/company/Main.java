package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Payable oneWayTicket = new com.company.Payable(150);
        Payable prepaidCard = new com.company.Payable(210);

        Line.B.enter(oneWayTicket);
        Line.C.exit(oneWayTicket);

        System.out.println(oneWayTicket.getValue());
        System.out.println(Line.C.toString());
    }
    }
}
