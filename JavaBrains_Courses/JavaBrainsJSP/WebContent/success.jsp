<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="org.mzherdev.dto.User" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success</title>
</head>
<body>

<h1>Login successful</h1>

<%
 //User user = (User) session.getAttribute("user") ;
 %>


<%
 //user = (User) request.getAttribute("user") ;
 %>
 
 
 <jsp:useBean id="user" class="org.mzherdev.dto.User" scope="request">
 		<jsp:setProperty property="userName" name="user" value="NewUser"></jsp:setProperty>
 </jsp:useBean>
  
  Hello <%= user.getUserName() %>
  
  Hello <jsp:getProperty property="userName" name="user"/>
 
 
 
</body>
</html>