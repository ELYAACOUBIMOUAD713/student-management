package com.example;

public class Main {

    public static void main(String[] args) {

        StudentService service = new StudentService();

        System.out.println(service.average()); 
        service.addStudent(null);               
        service.findStudent(null);               
    }
}

