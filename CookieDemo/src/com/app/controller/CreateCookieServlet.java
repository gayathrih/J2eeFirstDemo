package com.app.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateCookieServlet
 */
@WebServlet("/create_ck_srv.do")
public class CreateCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateCookieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		 response.setContentType("text/html");
		 PrintWriter out = response.getWriter();
		
		   String name=request.getParameter("uname");
		   String password=request.getParameter("pwd");
		   String address= request.getParameter("address");
		    
		   //create cookie
		   Cookie ck1 =  new Cookie("u_name",name);
		   Cookie ck2 =  new Cookie("u_addr",address);
		   
		     ck1.setMaxAge(100); //time -sec
		   response.addCookie(ck1);
		   response.addCookie(ck2);
		   
		   response.sendRedirect("get_ck_srv.do");
		   
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
	}

}
