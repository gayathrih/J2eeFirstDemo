package com.app.serveletconfig.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
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
    	  
    	  //get Initilization parama
    	    ServletConfig cfg= getServletConfig();
    	      String driverVal=cfg.getInitParameter("driver");
    	       String unameVal = cfg.getInitParameter("uname");
    	       
    	        //DBCOnn..
    	        //class.forName("com.mysql.jdbc.Driver");
    	        //class.forName(driverVal);
    	       
    	       out.println(driverVal+"<br>"+unameVal);
    	 
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
