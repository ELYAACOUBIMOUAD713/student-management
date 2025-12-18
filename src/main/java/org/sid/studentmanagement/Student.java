package com.example;

public class Student {

    public String name;
    public int age;
    public double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }
}
