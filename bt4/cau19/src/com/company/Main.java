package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var tv = new Tivi();
        tv.On();
        tv.Show();
        tv.nextChannel();
        tv.previousChannel();
        tv.Switch("VTV3");
        tv.Off();
    }
}
