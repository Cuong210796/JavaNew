package com.company;

public class Account {
    private String name;
    private int id;

    public Account(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "ID: "+id + "\n" + "Name: " + name;
    }
}
