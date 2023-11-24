package com.practice;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.*;
import javax.servlet.http.*;

public class MyServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void doGet (HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		System.out.println("This is get method ............");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h1>This is get method from http servlet</h1>");
		out.println(new Date().toString());
		
	}
	  

}
