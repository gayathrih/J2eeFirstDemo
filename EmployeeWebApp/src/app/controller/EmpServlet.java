package app.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmpServlet extends HttpServlet {
	
	  public void doPost(HttpServletRequest req, HttpServletResponse res)
	  {
		  
		  try{
			  
		  
		    res.setContentType("text/html");
		    PrintWriter out=res.getWriter();
		    
		    //Get form data
		    
		   String id=  req.getParameter("eid");
		   String name=req.getParameter("ename");
		   String desig=req.getParameter("edesig");
		   
		   //print details
		    out.println("<body>");
		    
		    out.println("<h3><font color='Green'> Employee Details<br>");
		    out.println("  ID : "+id+"<br>"+
		                " Name: "+name+"<br>"+
		    		    "DEsignation : "+desig);
		    out.println("</font>");
		    out.println("</h3>");
		   
		    out.println("</body>");
		    
		    
		    
		  }catch(Exception e){e.printStackTrace();}
		  
	  }

}
