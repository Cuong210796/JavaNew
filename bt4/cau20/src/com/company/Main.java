package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập K B O tương ứng với kéo búa bao :");
        String user = input.next();
        var ott = new OANTT();
        ott.setBot();
        ott.setUser();
    }
}
