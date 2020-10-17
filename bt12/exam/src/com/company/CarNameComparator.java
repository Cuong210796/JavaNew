package com.company;

import java.util.Comparator;

public class CarNameComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getCarName().compareTo(o2.getCarName());
    }
}
