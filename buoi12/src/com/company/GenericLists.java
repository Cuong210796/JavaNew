package com.company;

public class GenericLists<T> implements Comparable<T>  {
    private T[] arr;
    private int counter;

    public GenericLists(int size) {
        arr = (T[])new Object[size];
    }

    public void add(T item) {
        arr[counter++] = item;

    }

    public T get(int index) {
        return arr[index];
    }

    @Override
    public String toString() {
        String result ="";
        for (T item : arr)
            result += item + "\t";
        return result;
    }
@Override
    public int compareTo(T o){
           return 0;
    }
}
