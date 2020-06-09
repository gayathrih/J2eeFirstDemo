
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

    <h2>Account DEatils</h2>
    
      <!--  AccountBean accBean = new AccountBean(); -->
      
      <jsp:useBean id="accBean" class="app.model.AccountBean" scope="page">
     
          <!--  accBean.setAccNo(1111) -->
       <%--  <jsp:setProperty  name="accBean" property="accno" value='<%=Integer.parseInt(request.getParameter("accno"))%>'></jsp:setProperty>
            
         <jsp:setProperty  name="accBean" property="accPwd" value='<%=request.getParameter("accPwd")%>'></jsp:setProperty>
       --%>
       
       <jsp:setProperty name="accBean" property="*"/>
      
        </jsp:useBean>
                    
                     <!-- accbean.getAccno() -->
           AccNo : <jsp:getProperty name="accBean" property="accno" /><br>
           Acc Pwd: <jsp:getProperty name="accBean" property="accPwd"/>
           
          
         
       
          
     

</body>
</html>