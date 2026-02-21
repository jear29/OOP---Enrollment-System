package org.example;

import org.example.model.Course;
import org.example.model.Student;
import org.example.service.CourseRegistration;
import org.example.service.StudentRegistration;

public class Main {
    public static void main(String[] args) {

        // STUDENT REGISTRATION
        StudentRegistration studentRegistration = new StudentRegistration();

        // create
        studentRegistration.saveStudent(new Student("000123", "John Doe", "Information Technology"));

        // read
        studentRegistration.displayAllStudent();

        // update
        studentRegistration.updateStudent(new Student("000123", "John Doe", "Computer Science"));

        // delete
        studentRegistration.removeStudent(new Student("000123", "John Doe", "Computer Science"));

        // COURSE REGISTRATION
        CourseRegistration courseRegistration = new CourseRegistration();

        // create
        courseRegistration.save(new Course("00001", "Integrative Programming", "Information Technology"));

        // read
        courseRegistration.displayAll();

        // update
        courseRegistration.updateCourse(new Course("00001", "Information Management", "Information Technology"));

        // delete
        courseRegistration.removeCourse(new Course("00001", "Information Management", "Information Technology"));
    }
}