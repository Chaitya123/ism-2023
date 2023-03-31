package com.google.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignupController extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response) {
		System.out.println("Signupcontroller");
		String Firstname = request.getParameter("Firstname");
		String Lastname = request.getParameter("Lastname");
		String email = request.getParameter("email");
		
		System.out.println("Firstname:" +Firstname);
		System.out.println("Lastname:" +Lastname);
		System.out.println("email:" +email);
		
	}

}






















































































































