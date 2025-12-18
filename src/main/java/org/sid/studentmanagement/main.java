package org.sid.studentmanagement;

public class Main {

    public static void main(String[] args) {

        StudentService service = new StudentService();

        System.out.println(service.average()); // BUG volontaire
        service.addStudent(null);               // BUG
        service.findStudent(null);               // BUG
    }
}
