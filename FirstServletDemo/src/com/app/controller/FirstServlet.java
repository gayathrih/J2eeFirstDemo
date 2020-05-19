//server
package com.app.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{

	 public void doGet(HttpServletRequest request , HttpServletResponse response)
			 throws IOException{
		 
		 //System.out.println("Welcome to Servlets...");
		 
		 response.setContentType("text/html");
		 PrintWriter pw=response.getWriter();
		 pw.print("Welcom to App");
	 }

}

/*
 *  Objec
 *  
 *  methds
 *   FirstServlet obj = new FristServlet();
 *    obj.doGet(req,es);
 *  */

