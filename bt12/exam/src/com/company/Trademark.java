package com.company;

import java.util.List;

public interface Trademark<T> extends Comparable<T> {
    void add(T o);
    T search(String name);
    List<T> sort(int compareAttribute);
}
