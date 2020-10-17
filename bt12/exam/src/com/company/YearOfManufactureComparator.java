package com.company;

import java.util.Comparator;

public class YearOfManufactureComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getYearOfManufacture() - o2.getYearOfManufacture();
    }
}
