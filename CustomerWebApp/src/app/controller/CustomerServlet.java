package app.controller;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import app.dao.util.MySQLDBUtil;

public class CustomerServlet extends HttpServlet {

	
	  public void processRequest(HttpServletRequest req, HttpServletResponse res)
			  throws Exception
	  {
		  
		  res.setContentType("text/html");
		  PrintWriter out=res.getWriter();
		  //form actions
		    //a.Get customer form data
		   String id= req.getParameter("cid");
		   String name= req.getParameter("cname");
		   String addr= req.getParameter("caddr");
		   
		   //2. DBConnection
		   
		   Connection conn= MySQLDBUtil.getMySqlDBConn();
		   
		   String insert =  "insert into customer values(?,?,?)";
		    PreparedStatement pstmt=conn.prepareStatement(insert);
		      pstmt.setString(1, id);
		      pstmt.setString(2, name);
		      pstmt.setString(3, addr);
		      
		      boolean result=pstmt.execute();
		      
		      if(result)
		    	  out.println("Error...!!!!");
		    	   
		      else
		    	  out.println("Data stored!!!"); 
		    	    
		      
		      
		      
		      
	  }
	  
	  public void doGet(HttpServletRequest req , HttpServletResponse res){
		  try {
			processRequest(req, res);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	  
      public void doPost(HttpServletRequest req , HttpServletResponse res){
    	  try {
			processRequest(req, res);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
}
