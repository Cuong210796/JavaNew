package com.company;

import com.sun.management.VMOption;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 //write your code here
    var video = new Video();
    video.setFileName("video.mp4");
    video.setTitle("jeny's brd");
    video.setUser(new User("john.gmail.com"));
    var processor = new VideoProcessor(new VideoEncoderH264(), new SqlDatabase(), new GmailService());
     processor.process(video);
    }
}
