package com.app.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet.do")
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
	    PrintWriter out  = response.getWriter();
	    
	    //1. Get form data	
	    
	      String name=request.getParameter("uname");
	      String pwd=request.getParameter("pwd");
	      
	    // validations
	      
	        ServletContext ctx  =  getServletContext();
	          RequestDispatcher requestDispatcher=null;
	          
	      java.util.List<String> errlist = new java.util.ArrayList<>();
	      
	      
	      if(((pwd.length()==0) || (pwd.length()<=5))){
	    	  errlist.add("pls enter password<br> passwordshould contain morethan 5 chars");
	      }
	      
	      if( ((name.length()==0) || (name.length()<=2))  ){
	    	  errlist.add("pls enter username<br> username should contain morethan 2 chars");
	    	  
	      }
	      
	     
	      if(errlist.isEmpty()){
	    	  request.setAttribute("username", name);
	    	  requestDispatcher =  ctx.getRequestDispatcher("/SuccessServlet.view");
	    	  requestDispatcher.forward(request, response);
	      }
	      else{
	    	  request.setAttribute("errorMsg", errlist);
	    	  
	    	  requestDispatcher =  ctx.getRequestDispatcher("/ErrorServlet.view");
	    	  requestDispatcher.forward(request, response); 
	    	  
	    	 
	      }
	      
	     
	      	 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   doGet(request, response);
	}

}
