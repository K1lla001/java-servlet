package com.servlet.webapp.entity;
public class Student {
    private String studentID;
    private int mark;

    public Student(String studentID, int mark) {
        this.studentID = studentID;
        this.mark = mark;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}

