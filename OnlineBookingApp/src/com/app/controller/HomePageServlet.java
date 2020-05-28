package com.app.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomePageServlet
 */
@WebServlet("/homepage_srv.do")
public class HomePageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public HomePageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		  response.setContentType("text/html");
		  PrintWriter out=response.getWriter();
		  
		  //1. get form para
		  
		  String existingUser= request.getParameter("r1");
		   String newUser=request.getParameter("r1");
		   
		   //out.print("existing_user =  "+existingUser+"<br> New user = "+newUser);
		   ServletContext ctx = getServletContext();
		   RequestDispatcher dispatcher=null;
		   // condition
		     if(existingUser.equals("existing_user")){
		    	 
		    	 
		    	  dispatcher = ctx.getRequestDispatcher("/login_srv.do");
		    	  dispatcher.forward(request, response);
		     }
		     else if(newUser.equals("new_user")){
		    	 
		    	   dispatcher = ctx.getRequestDispatcher("/reg_srv.view");
		    	  dispatcher.forward(request, response);
		     }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
