package com.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected void processRequest(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<!DOCTYPE html>");
        out.println ("<html>");
        out.println ("<head>") ;
        out.println("<title>Servlet S2</title>") ;
        out.println("</head>") ;
        out.println ("<body>") ;
        out.println("<h2>url rewriting</h2>");
        out.println("<h1>welcome to servlet 2</h1>");
        
        //uncomment line no 30 and comment line 33 to see url rewriting
        //String name=request.getParameter("user");
        
        String name=request.getParameter("user_name");
        out.println("<h1>welcome back mr. "+name+"</h1>");
       
		out.println ("</body>") ;
        out.println("</html>") ;

	}
	
//	@Override
	public void doPost (HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		processRequest(request,response);
	}
//	@Override
	public void doGet (HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		processRequest(request,response);
	}

}
