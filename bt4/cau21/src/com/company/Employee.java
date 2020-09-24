package com.company;

public class Employee extends Person{
    private static int currentId = 1;
    private int id;
    private String mp;

    public Employee(int id, String mp, String name, String birthday) {
        super(name, birthday);
        this.id = currentId++;
        this.mp = mp;
    }

    @Override
    public String toString() {
        return "ID: "+id + "\n" +"Department: "+ mp + "\n" +"Name: "+ getName() + "\n" +"BirthDate: "+getBirthday();
    }
}
