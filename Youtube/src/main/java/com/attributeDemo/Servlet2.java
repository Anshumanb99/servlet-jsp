package com.attributeDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2  extends HttpServlet{

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
        int nn1=Integer.parseInt(request.getParameter("n1"));
        int nn2=Integer.parseInt(request.getParameter("n2"));
        
        int p=nn1*nn2;
        int sum=(int) request.getAttribute("sum");
        out.println ("<h1>") ;
        out.println ("Sum is: "+sum) ;
        out.println ("Product is: "+p) ;
        out.println ("</h1>") ;
        
        
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
