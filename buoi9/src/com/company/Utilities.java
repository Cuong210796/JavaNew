package com.company;

public class Utilities {
    public  static <T extends  Comparable> T max(T obj1, T obj2){
        if(obj1.compareTo(obj2)>=0)
            return obj1;
        return obj2;
    }

    public static <K,V> void printUser(K key, V value){
        System.out.println(key + " : " + value);
    }

    public static void  printUsers(GenericList<?> student){
        System.out.println(student);
        Object ur = student.get(0);
    }
}
