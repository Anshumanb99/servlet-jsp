package com.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet{

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
        out.println("<title>Servlet S1</title>") ;
        out.println("</head>") ;
        out.println ("<body>") ;
        
        String name=request.getParameter("user_name");
       
        out.println("<h2>url rewriting</h2>");
        out.println("<h1>Servlet1 and name="+name+"</h1>");
        
        //url rewiting uncomment line34 and comment line36-42
        //out.println ("<a href='Servlet2?user="+name+"'>Go to servlet2</a>") ;
        
        //using hidden field
        out.println(""
        		+"<form action='Servlet2'>"
        		+"<input type='hidden' name='user_name' value='"+name+"'/>"
        		+"<button>Go to second servlet</button>"
        		+""
        		+"</form>");
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
