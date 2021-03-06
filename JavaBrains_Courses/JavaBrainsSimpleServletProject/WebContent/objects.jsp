<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Objects</title>
</head>
<body>

<%
	String userName = request.getParameter("name");
	
	if(userName != null) {
		session.setAttribute("sessionUserName", userName);
		//application.setAttribute("applUserName", userName);
		pageContext.setAttribute("pageContextUserName", userName);
		pageContext.setAttribute("applUserName", userName, PageContext.APPLICATION_SCOPE);
		pageContext.findAttribute("applUserName");
	}
%>

<br>
	The user name in the request object is: <%= userName %>
<br>
	The user name in the session object is: <%= session.getAttribute("sessionUserName") %>
<br>
	The user name in the application object is: <%= application.getAttribute("applUserName") %>
<br>
	The user name in the pageContext object is: <%= pageContext.getAttribute("pageContextUserName") %>
</body>
</html>