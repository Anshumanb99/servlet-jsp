package com.session;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
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
        
        //getting all the cookie
        Cookie[] cookies=request.getCookies();
        boolean f=false;
        String name="";
        
        if(cookies==null) {
        	out.println ("<h1>You are new user goto home page and submit your name") ;
        	return;
        }else {
        	for(Cookie c: cookies) {
        		String tname=c.getName();
        		if(tname.equals("user_name")) {
        			f=true;
        			name=c.getValue();
        		}
        	}
        }
        if(f) {
        	 out.println("<h1>Hrllo "+name+" welcome back to website...</h1>");
             out.println("<h1>Thank you</h1>");
        }else {
        	out.println ("<h1>You are new user goto home page and submit your name") ;
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
