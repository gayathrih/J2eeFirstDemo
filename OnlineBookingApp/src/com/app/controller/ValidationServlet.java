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
 * Servlet implementation class ValidationServlet
 */
@WebServlet("/Validation_srv.do")
public class ValidationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
		  PrintWriter out=response.getWriter();
		  
		   //get login form data
		  String name=request.getParameter("uname");
		  String pwd=request.getParameter("pwd");
		  String role=request.getParameter("role");
		  
		    ServletContext ctx = getServletContext();
		     RequestDispatcher dispatcher=null;
		     
		  //validations
		  if(name.equals("admin")&& pwd.equals("123")&&role.equals("admin")){
			  
			   dispatcher= ctx.getRequestDispatcher("/admin_srv.view");
			    dispatcher.forward(request, response);
		  }
		  else if(name.equals("guest")&& pwd.equals("abc123")&&role.equals("customer")){
			  dispatcher= ctx.getRequestDispatcher("/customer_srv.view");
			    dispatcher.forward(request, response);
		  }
		  else{
			   out.println("<font color='red'>Invalid Credential</font>");
			   dispatcher= ctx.getRequestDispatcher("/login_srv.do");
			    dispatcher.include(request, response);
		  }
		  
		  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  
	   doGet(request, response);
	}

}
