package com.attributeDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1  extends HttpServlet{

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
        String n1=request.getParameter("n1");
        String n2=request.getParameter("n2");
        int nn1=Integer.parseInt(n1);
        int nn2=Integer.parseInt(n2);
        
        int s=nn1+nn2;
        request.setAttribute("sum", s);
        
        //forwarding the request with the help of request dispatcher
        RequestDispatcher rd=request.getRequestDispatcher("/Servlet2");//this is the url of success servlet
		rd.forward(request, response);
        
        
        
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
