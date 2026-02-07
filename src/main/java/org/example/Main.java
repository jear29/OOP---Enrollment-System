package org.example;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentID("000123");
        student.setStudentName("John Doe");
        student.setProgram("Information Technology");

        student.display();

        Student student1 = new Student();
        student1.setStudentID("000124");
        student1.setStudentName("Jane Doe");
        student1.setProgram("Information Technology");

        student1.display();

        Course course = new Course();
        course.setCourseID("00001");
        course.setCourseName("Integrative Programming");
        course.setProgram("Information Technology");

        course.display();
    }
}