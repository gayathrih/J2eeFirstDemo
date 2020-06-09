<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
      <%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!--create db connection  -->
<!-- Connection conn =  DriverMange;
conn.create -->

  <sql:setDataSource var="ds"
                     driver="com.mysql.jdbc.Driver"
                     user="root"
                     password="admin"
                     url="jdbc:mysql://localhost:3308/custdb"
                     scope="session"/>
               
  <sql:transaction dataSource="${ds}">  
    <!-- DML -->                 
   	<sql:update  var="i"
   	             sql="insert into book values(?,?,?)">  
   	        <sql:param value="${param.bookid}"> </sql:param> 
   	         <sql:param value="${param.bookName}"> </sql:param>
   	          <sql:param value="${param.authorName}"> </sql:param>    
              
     </sql:update>
     
     	<%-- <sql:update  var="i"
   	             sql="delete from book(?)">  
   	        <sql:param value="${param.bookid}"> </sql:param> 
   	            
              
     </sql:update> --%>
      inserted...!
      
     </sql:transaction> 
     
       <br>
       
      <sql:query var="rs" sql="select * from book" dataSource="${ds}">
      </sql:query>
      
          <c:forEach var="result" items="${rs.rows}">
              <c:out value="${result.BookID}"/>
              <c:out value="${result.BookName}"/>
              <c:out value="${result.BookAuthor}"/>
              <br>
          </c:forEach>
        
      
                 


</body>
</html>