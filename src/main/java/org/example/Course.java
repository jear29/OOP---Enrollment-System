package org.example;

public class Course {
    private String courseID;
    private String courseName;
    private String program;

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String program() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public void display() {
        System.out.printf("\nCourse ID: %s\n", getCourseID());
        System.out.printf("Course Name: %s\n", getCourseName());
        System.out.printf("Program: %s\n", program());
    }
}
