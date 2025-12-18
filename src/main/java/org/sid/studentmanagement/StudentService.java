package org.sid.studentmanagement;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private List<Student> students = new ArrayList();

    public void addStudent(Student s) {
        students.add(s);
    }

    public double average() {
        double sum = 0;
        for (Student s : students) {
            sum = sum + s.grade;
        }
        return sum / students.size();
    }

    public Student findStudent(String name) {
        for (Student s : students) {
            if (s.name.equals(name)) {
                return s;
            }
        }
        return null;
    }
}