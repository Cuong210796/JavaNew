package com.company;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo {
    public static void run(){
        List<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add(0,"c");//index chèn vị trí

        System.out.println(strings.indexOf("b"));
    }
}
