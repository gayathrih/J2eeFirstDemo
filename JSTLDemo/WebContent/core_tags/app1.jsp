<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


 
 <c:out value="JSTL Demos"/>
 
 <!-- i=3 -->
 
 <c:set var="i" value="0"/>
 
    <br>
   i value = <c:out value="${i}"/>
   
   <!-- if con -->
        <br>
       <c:if var="res" test="${i>=0}">
         <%--  <c:out value="${res}"/> --%>
          <c:out value="${i}"/> is positive value
       </c:if>
       <br>
     <!--choose  -->
       <c:choose>
           <c:when test="${i>=0}">
              <c:out value="${i}"/> is Positive 
           </c:when>
           
           <c:when test="${i<=0}">
              <c:out value="${i}"/> is Negitive 
           </c:when>
           
            <c:when test="${i==0}">
              <c:out value="${i}"/> is eqauls to zero 
           </c:when>
       
          <c:otherwise>
              <c:out value="${i}"/>  invalid
          </c:otherwise>
       
       </c:choose>
         
         <br>
         
         <br>
         
         <c:forEach var="j" begin="3" end="6">
            <c:out value="${j}"/><br>
         </c:forEach>

         <c:forTokens var="item" items="apl=plee@bananaf@ggg@kkk" delims="a">
            <c:out value="${item}"/><br>
         </c:forTokens>
         
         

</body>
</html>