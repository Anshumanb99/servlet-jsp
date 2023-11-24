package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SecondServlet extends GenericServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		System.out.println("This is servlet using generic servlet");
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<h1>This is output from servlet created  using generic servlet</h1>");
		out.println("<h1>Today date and time "+new Date().toString()+"</h1>");
		
	}

	
}
