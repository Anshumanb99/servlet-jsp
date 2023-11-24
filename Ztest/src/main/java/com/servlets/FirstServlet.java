package com.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet implements Servlet{

	ServletConfig conf;
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("going to destroy servlet object");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return this.conf;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "This servlet is created by a noob";
	}

	@Override
	public void init(ServletConfig conf) throws ServletException {
		this.conf=conf;
		System.out.println("Creating objerct");
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("servicing ..............");
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<h1>This is output from servlet</h1>");
		out.println("<h1>Today date and time "+new Date().toString()+"</h1>");
	}

}
