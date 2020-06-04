

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
        <h3> JSP Scriplet Elements Application</h3>

          <%--  EVEN or ODD Num  --%>
          
        
        
        <%
           int i=10;
           
        
            if(i%2==0){
        %>    	
            	<h3> <font color='green'> <%=i%> Even Num</font></h3>
            	
         <%}else{%>
                  <h3> <font color='green'> <%=i%> ODD Num</font></h3>
             <%}%>     
            	
       
        
         

</body>
</html>