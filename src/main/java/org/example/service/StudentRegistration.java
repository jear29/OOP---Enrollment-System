package org.example.service;

import org.example.model.Student;

import java.util.ArrayList;

public class StudentRegistration {
    private ArrayList<Student> studentList = new ArrayList<>();

    public void saveStudent(Student student) {
        studentList.add(student);
    }

    public void displayAllStudent() {
        System.out.println(studentList);
    }

    public void updateStudent(Student student) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getStudentName().equals(student.getStudentID())) {
                studentList.set(i, student);
                break;
            }
        }
    }

    public String removeStudent(Student student) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getStudentID().equals(student.getStudentID())) {
                studentList.remove(i);
                return "Successfully removed";
            }
        }
        return "Error";
    }
}
