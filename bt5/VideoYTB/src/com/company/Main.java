package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Video video = new Video();
        video.setFileName("video.mp4");
        video.setTitle("jeny's brd");
        video.setUser(new User("john.gmail.com"));
        VideoProcessor processor = new VideoProcessor(new VideoEncoderH264(), new SqlDatabase(), new GmailService());
        processor.process(video);
    }
}
