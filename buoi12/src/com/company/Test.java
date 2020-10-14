package com.company;



import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test {
    public static void run() {
        GenericList<User> users = new GenericList<>(2);
        users.add(new User("Thanh"));
        users.add(new User("Nam"));

        for (User user : users) System.out.println(user);


    }
}
