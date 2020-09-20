package com.company;

public class Browser {
    public String navigate(String url){
        String ipAddress = findIP(url);
        String content = sendHttpRequest(ipAddress);
        return content;
    }
    private String sendHttpRequest(String ipAdd){
        return "<html></html>";
    }
    private String findIP(String domainName){
        return "Dia chi ip : 192.168.1.1";
    }
}
