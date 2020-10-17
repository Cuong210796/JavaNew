package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MercedesC implements Trademark<Car> {
    private ArrayList<Car> list;

    public MercedesC() {
        this.list = new ArrayList<>();
    }

    @Override
    public void add(Car o) {
        list.add(o);
    }

    @Override
    public Car search(String name) {
        for (var item : list)
            if (item.getCarName().contains(name))
                return item;
        return null;
    }

    @Override
    public List<Car> sort(int compareAttribute) {
        for (var item : list)
            item.setCompareAttribute(compareAttribute);
        Collections.sort(list);
        return null;
    }

    @Override
    public int compareTo(Car o) {
        return 0;
    }

    @Override
    public String toString(){
        return list.toString();
    }
}
