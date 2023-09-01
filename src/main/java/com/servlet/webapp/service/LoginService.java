package com.servlet.webapp.service;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginService extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String userID = request.getParameter("userID");
        String password = request.getParameter("password");

        if ("admin".equals(userID) && "admin".equals(password)) {
            response.getWriter().write("Success Login");
            System.out.println("Success Login from login user!");
        } else {
            response.getWriter().write("Failed Login");
            System.out.println("Failed Login from login user!");
        }
    }
}
