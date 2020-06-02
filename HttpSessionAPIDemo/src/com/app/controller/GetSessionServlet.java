package com.app.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class GetSessionServlet
 */
@WebServlet("/getsession.do")
public class GetSessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetSessionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         HttpSession session=request.getSession();
         
         response.setContentType("text/html");
		 PrintWriter out = response.getWriter();
		 
		  /*session.removeAttribute("u_name");
		  session.removeAttribute("u_password");*/
		 
		 
		 session.invalidate();
		 
		 out.println("GetSession_Servlet  = session ID: "+session.getId());
          String name=session.getAttribute("u_name").toString();
          String pwd=session.getAttribute("u_password").toString();
          
         out.println("<font color='green'> Welcome to "+ name+"<br>"+
        		   " Ur password "+pwd+"</font>");
            
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	 doGet(request, response);
	}

}
