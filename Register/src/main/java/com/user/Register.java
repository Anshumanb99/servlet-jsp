package com.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.jdi.connect.spi.Connection;

public class Register extends HttpServlet{

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
        
        //getting all incoming detail from request
        String name=request.getParameter("user_name");
        String password=request.getParameter("user_password");
        String email=request.getParameter("user_email");
        out.println(name+" "+email+" "+password);
        
        //Connection.class.....email.
        try {
//        	Thread.sleep(3000);
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	java.sql.Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube", "root", "root");
        	
        	//query
        	String q="insert into user(name,password,email) values(?,?,?)";

        			PreparedStatement pstmt=conn.prepareStatement(q);
        			pstmt.setString(1,name) ;

        			pstmt.setString (2, password) ;

        			pstmt.setString (3,email);

        			pstmt.executeUpdate();

        			out.println("<h1>done.......</h1> ");
        			
        	
        }catch(Exception e) {
        	e.printStackTrace();
        	out.println("error..........");
        }
        
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
