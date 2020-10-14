package com.company;

public class Student implements Comparable<Student> {
    private int point;

    public Student(int point) {
        this.point = point;
    }

    @Override
    public int compareTo(Student o) {
        return this.point - o.point;
    }
}
