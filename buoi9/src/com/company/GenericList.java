package com.company;
import java.lang.String;

public class GenericList<T extends Comparable> {
    private int size;
    private  T[] arr;
    private int counter;

    public GenericList(int size) {
        this.size = size;
        arr = (T[]) new Comparable[size];
    }
    public void add(T item){
        arr[counter++] = item;
    }
    public T get(int index){
        return arr[index];
    }


    public int getSize() {
        return size;
    }

    public T[] getArr(int i) {
        return arr;
    }

    public int getCounter() {
        return counter;
    }

    @Override
    public String toString(){
        String result ="";
        for(T item:arr)
         result += item + "\t";
        return result;
    }
}
