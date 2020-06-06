<%@ page language="java" 
         import="app.dao.util.*,java.sql.*"
         contentType="text/html; charset=ISO-8859-1"
          pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

    <h2>Product Information</h2>
    
    <% 
    
       Connection conn=MySQLDBUtil.getMySqlDBConn();
        String insertQuery = "insert into product values(?,?,?)";
       PreparedStatement pstmt= conn.prepareStatement(insertQuery);
    
        int id = Integer.parseInt(request.getParameter("pid"));
    	String name=request.getParameter("pname");
    	Float price=Float.parseFloat(request.getParameter("pprice"));
    	
    	   pstmt.setInt(1, id);
    	   pstmt.setString(2, name);
    	   pstmt.setFloat(3, price);
    	
    	
    	
    	  boolean res=pstmt.execute();
    	  if(res){
    		  out.println("<font color='red'>Error While storing!!!!</font>");

    	  }
    	  else{
    		      		  out.println("ID = "+id+"<br>"+
        	            "Name = "+name+"<br>"+
        	            "Price = "+price+"<br><br>");
      		   out.println("<h3><font color='pink'>Product details has stored!!!!</font></h3>");
    	  }
    
    %>
    <br>
    
    <a href="ProductForm.jsp">GoTo HomePage</a>
    
    

</body>
</html>