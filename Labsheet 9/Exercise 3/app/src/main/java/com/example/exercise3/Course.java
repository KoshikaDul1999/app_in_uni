package com.example.exercise3;

public class Course {
    private String courseCode;
    private String courseName;
    private String lecturer;
    private String credits;

    public Course(String courseCode, String courseName, String lecturer, String credits) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.lecturer = lecturer;
        this.credits = credits;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getLecturer() {
        return lecturer;
    }

    public String getCredits() {
        return credits;
    }
}
