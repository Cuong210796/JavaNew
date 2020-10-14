package com.company;

public class DoubleNumber extends ComparableNumber<DoubleNumber> {
    private final double value;

    public DoubleNumber(double value) {
        this.value = value;
    }

    @Override
    public double doubleValue() {
        return value;
    }

    @Override
    public DoubleNumber add(DoubleNumber o) {
        return new DoubleNumber(this.doubleValue() + o.doubleValue());
    }

    @Override
    public DoubleNumber sub(DoubleNumber o) {
        return null;
    }

    @Override
    public int compareTo(ComparableNumber<?> o) {
        return 0;
    }
}
