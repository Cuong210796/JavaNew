package com.company;

public class User {
    public Object compareTo;
    private String userName;

    public User(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return userName;
    }

}
