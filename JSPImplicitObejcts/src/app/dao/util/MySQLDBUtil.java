package app.dao.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;

public class MySQLDBUtil {
	
	 public static Connection getMySqlDBConn(){
		    String url="jdbc:mysql://localhost:3308/productdb";
		    String uname="root";
		    String pwd="admin";
	Arrays.sort();	    
		    
		   Connection conn=null;
		   
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url,uname,pwd);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		    	
		 
		 
		  return conn;
	 }

}
