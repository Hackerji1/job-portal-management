package com.jsp.job_portal_management.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/information")
public class UserRegistrationController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String phone = req.getParameter("phone");
		String city = req.getParameter("city");
		String jobtype = req.getParameter("options");
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(password);
		System.out.println(phone);
		System.out.println(city);
		System.out.println(name);
		System.out.println(name);
		
	}
}
