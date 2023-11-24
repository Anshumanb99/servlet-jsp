package com.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class RegisterServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void doPost (HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h2>Welcome to register servlet</h2>");
		String name=request.getParameter("user_name");
		String passwords=request.getParameter("user_password");
		String email=request.getParameter("user_email");
		String gender=request.getParameter("user_gender");
		String course=request.getParameter("user_option");
		String cond=request.getParameter("condition");
		
		if(cond!=null) {
			out.println("<h2>Name:"+name+"</h2>");
			out.println("<h2>passwords:"+passwords+"</h2>");
			out.println("<h2>email:"+email+"</h2>");
			out.println("<h2>gender:"+gender+"</h2>");
			out.println("<h2>course:"+course+"</h2>");
			out.println("<h2>cond:"+cond+"</h2>");
			
			RequestDispatcher rd=request.getRequestDispatcher("/success");//this is the url of success servlet
			rd.forward(request, response);
		}else {
			out.println("<h2>You have not accepted terms and condition</h2>");
		//I want to include output of index.html
			
			//generate object of request dispatcher
			RequestDispatcher rd=request.getRequestDispatcher("index.html");//this is the file name we want to include, we can also include servlet as shown above in forward mwthod
		//include
			rd.include(request,response);
		
		}
	}
	}


