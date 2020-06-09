<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/function" prefix="fn"%>
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

  <c:out var="str" value="hello world"/>

<c:if  value="res" test= "${fn:contains(str,'hello')">
    <%-- <c:out value="${res}"/> --%>
     string is found
</c:if>

</body>

 <!-- STring str = "hello World";
   boolean=str.contains("world") -->
</html>