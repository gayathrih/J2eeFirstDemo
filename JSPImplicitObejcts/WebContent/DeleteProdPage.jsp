<%@ page language="java" 
    import="app.dao.util.* ,  java.sql.*"
    contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<% 
    
       Connection conn=MySQLDBUtil.getMySqlDBConn();
        String insertQuery = " delete from product where id=?";
       PreparedStatement pstmt= conn.prepareStatement(insertQuery);
    
        int id = Integer.parseInt(request.getParameter("pid"));
    	
    	
    	   pstmt.setInt(1, id);
    	  
    	
    	
    	
    	  boolean res=pstmt.execute();
    	  if(res){
    		  out.println("<font color='red'>Error While storing!!!!</font>");

    	  }
    	  else{
    		      		 
      		   out.println("<h3><font color='pink'>Product Deleted !!!!</font></h3>");
    	  }
    
    %>
    <br>
    <a href="DisplayProducts.jsp"> View Products </a>
     <br>
     <br>
    <a href="ProductForm.jsp">GoTo HomePage</a>
    
</body>
</html>