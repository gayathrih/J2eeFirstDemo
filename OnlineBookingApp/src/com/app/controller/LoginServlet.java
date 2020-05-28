package com.app.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login_srv.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
		  PrintWriter out=response.getWriter();
		  
		  out.println("<h3>Login Page<h3>");
		  out.println("<form action='Validation_srv.do' method=''>");
		  out.println(" Username : <input type='text' name='uname'><br>");
		  out.println("Password: <input type='password' name='pwd'/><br>");
		  out.println("Role :  <input type='radio' value='admin' name='role' checked/> Admin<br>");
          out.println("<input type='radio' value='customer' name='role'/>Customer<br>");
		
		  out.println("<input type='submit' value='SignIn'/>"
		  		+ "<input type='reset' value='Reset'/>");
		  out.println("</form>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
