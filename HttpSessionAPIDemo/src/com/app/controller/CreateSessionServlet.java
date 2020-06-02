package com.app.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CreateSessionServlet
 */
@WebServlet("/create_session.do")
public class CreateSessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateSessionServlet() {
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
		   
		   if(name.equals("Admin")&&password.equals("!We#$")){
		   //create a session
		    HttpSession session=request.getSession(true);
		    System.out.println("Session ID "+session.getId()+"<br>"+
		    		     " creation Tme: "+new Date(session.getCreationTime())+"<br>"+
		    		     "Last Access Time: "+new Date(session.getLastAccessedTime())+"<br>"+
		    		     "Age : "+session.getMaxInactiveInterval());
		    
		    session.setAttribute("u_name", name);
		    session.setAttribute("u_password", password);
		    
		    //session.setMaxInactiveInterval(60);
		    
		   /* ServletContext ctx =getServletContext();
		   RequestDispatcher rd=   ctx.getRequestDispatcher("");
		   rd.forward(request, response);*/
		    
		    getServletContext().getRequestDispatcher("/getsession.do").forward(request, response);
		    
		   }else{
			   out.println("<font color='red'> Invalid Login </font>");
			   getServletContext().getRequestDispatcher("/loginform.html").include(request, response);
		   }
		    
		    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	   doGet(request, response);
	}

}
