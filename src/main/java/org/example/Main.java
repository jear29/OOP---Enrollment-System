package org.example;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentID("000123");
        student.setStudentName("John Doe");
        student.setProgram("Information Technology");

        System.out.printf("\nStudent ID: %s\n", student.getStudentID());
        System.out.printf("Student Name: %s\n", student.getStudentName());
        System.out.printf("Program: %s\n", student.getProgram());

        Student student1 = new Student();
        student1.setStudentID("000124");
        student1.setStudentName("Jane Doe");
        student1.setProgram("Information Technology");

        System.out.printf("\nStudent ID: %s\n", student1.getStudentID());
        System.out.printf("Student Name: %s\n", student1.getStudentName());
        System.out.printf("Program: %s\n", student1.getProgram());

        Course course = new Course();
        course.setCourseID("00001");
        course.setCourseName("Integrative Programming");
        course.setProgram("Information Technology");

        System.out.printf("\nCourse ID: %s\n", course.getCourseID());
        System.out.printf("Course Name: %s\n", course.getCourseName());
        System.out.printf("Program: %s\n", course.program());



    }
}