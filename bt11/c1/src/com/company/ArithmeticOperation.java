package com.company;

interface ArithmeticOperation<T> {
    int CompareTo(ComparableNumber<?> o);
    T add(T o);
    T sub(T o);
}
