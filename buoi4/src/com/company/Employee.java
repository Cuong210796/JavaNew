package com.company;

public class Employee {

    private  String name;

    public void setAge(byte age) {
        if (age>0)
        this.age = age;
    }

    private byte age;
    private boolean gender;

     public Employee(String name, byte age){
         this.name = name;
         this.age = age;
     }

    public Employee(String name, byte age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }



    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}
