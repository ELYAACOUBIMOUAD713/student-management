package org.sid.studentmanagement;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private List<Student> students = new ArrayList();

    public void addStudent(Student s) {
        students.add(s); // null possible
    }

    public double average() {
        double sum = 0;

        for (int i = 0; i < students.size(); i++) {
            sum = sum + students.get(i).getGrade();
        }

        return sum / students.size(); // division par zéro
    }

    public Student findStudent(String name) {
        for (Student s : students) {
            if (s.name.equals(name)) { // NPE possible
                return s;
            }
        }
        return null;
    }
}
