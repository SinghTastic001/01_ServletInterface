package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GenericServletProgram extends GenericServlet{

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		arg1.setContentType("text/html");
		PrintWriter out = arg1.getWriter();
		System.out.println("this is generic servlet example of service");
		System.out.println("genericcc");
		
	}

}