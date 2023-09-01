package com.servlet.webapp.service;

import com.servlet.webapp.entity.Department;
import com.servlet.webapp.entity.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentService extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Department> departments = new ArrayList<>();

        Department department1 = new Department("Dep 1");
        department1.addStudent(new Student("S1", 35));
        department1.addStudent(new Student("S2", 70));
        department1.addStudent(new Student("S3", 60));
        department1.addStudent(new Student("S4", 90));

        Department department2 = new Department("Dep 2");
        department2.addStudent(new Student("S5", 30));

        Department department3 = new Department("Dep 3");
        department3.addStudent(new Student("S6", 32));
        department3.addStudent(new Student("S7", 70));
        department3.addStudent(new Student("S8", 20));

        departments.add(department1);
        departments.add(department2);
        departments.add(department3);

        for (Department department : departments) {
            department.calculatePassPercentage();
        }
        request.setAttribute("departmentData", departments);

        request.getRequestDispatcher("dashboard.jsp").forward(request, response);
    }

}
