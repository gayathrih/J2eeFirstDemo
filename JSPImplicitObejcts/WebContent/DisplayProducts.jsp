<%@ page language="java"
    import="java.sql.*,app.dao.util.*"
 contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>Display Product Details</h2>
	 <table border=1>
        	      &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        	      <thead> Product Details</thead>
        	       <tr>  <td>ID : </td> 
        	            <td>Name</td>
        	            <td>Price</td>
        	        </tr>    
	<%
	 Connection conn=MySQLDBUtil.getMySqlDBConn();
      String insertQuery = "select * from product";
      PreparedStatement pstmt= conn.prepareStatement(insertQuery);
          ResultSet rs =pstmt.executeQuery();
          
           while(rs.next()){
        %>
        	  
        	                <tr>
        	                <td><%=rs.getInt(1)%></td>
        	                 <td><%=rs.getString(2)%></td>
        	          
        	                <td><%=rs.getFloat(3)%></td>
        	                </tr>
        	          
        	      
        	       
          <% }%> 
        </table>
        
        <br><br>
        
        <a href="ProductForm.jsp">Goto ProductForm</a>
        
        
	
	 

</body>
</html>