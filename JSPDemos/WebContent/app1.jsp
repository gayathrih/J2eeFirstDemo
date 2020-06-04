

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
          
        <%! int i=4551;
            String res=null;
        %>
        
        <%
            
        
            if(i%2==0)
            	 res= i+" Even num";
            else
            	 res= i+" Odd num";
        %>
        
        Result: <%= res %>  

</body>
</html>