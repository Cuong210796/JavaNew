package com.company;

public class RationalNumber extends ComparableNumber<RationalNumber> {
    private int tuso;
    private int mauso;

    public RationalNumber(int tuso, int mauso) {
        this.tuso = tuso;
        this.mauso = mauso;
    }

    @Override
    public double doubleValue() {
        return 0;
    }

    @Override
    public RationalNumber add(RationalNumber o) {
        return null;
    }

    @Override
    public RationalNumber sub(RationalNumber o) {
        return null;
    }

    @Override
    public int compareTo(ComparableNumber<?> o) {
        return 0;
    }
}
