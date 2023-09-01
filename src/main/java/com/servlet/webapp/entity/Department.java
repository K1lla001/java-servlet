package com.servlet.webapp.entity;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Student> students = new ArrayList<>();
    private double passPercentage;

    public Department(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public double getPassPercentage() {
        return passPercentage;
    }

    public void setPassPercentage(double passPercentage) {
        this.passPercentage = passPercentage;
    }

    public void calculatePassPercentage() {
        if (students.isEmpty()) {
            passPercentage = 0;
            return;
        }

        int passCount = 0;
        for (Student student : students) {
            if (student.getMark() >= 40) {
                passCount++;
            }
        }

        passPercentage = ((double) passCount / students.size()) * 100;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
