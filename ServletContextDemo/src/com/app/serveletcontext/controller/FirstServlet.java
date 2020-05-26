package com.app.serveletcontext.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FirstServlet extends HttpServlet {

    public FirstServlet() {
        super();
        
    }

     public void  processRequest(HttpServletRequest request, HttpServletResponse response){
    	try{
    	  response.setContentType("text/html");
    	  PrintWriter out=response.getWriter();
    	  
    	  //Get init parae
    	    ServletConfig cfg= getServletConfig();
    	      String pwd1=cfg.getInitParameter("pwd_1");
    	      String pwd2=cfg.getInitParameter("pwd_2");
    	   //get Context Para
    	        ServletContext context = getServletContext();
    	        String driver=  context.getInitParameter("DBdriver");
    	        String url= context.getInitParameter("DBurl");
    	        String name= context.getInitParameter("uname");
    	        
    	          out.println(".......First Servlet......");
    	          out.println("DB Driver : "+driver+"<br>"+
    	                      "DB URl: "+url+"<br>"+
    	        		      "DB Uname : "+name+"<br>"+
    	        		      "pwd 1: "+pwd1+"<br>"+
    	                      "pwd 2: "+pwd2);
    	          
    	 
    	}catch(Exception e){
    		e.printStackTrace();
    	}
     }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request,response);
	}

}
