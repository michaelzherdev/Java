<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP JAVA BRAINS</title>
</head>
<body>
	<h3>Testing JSP</h3>
	
	<%!
		public int add(int a, int b) {
		return a + b;
	}
	%>
	
	<% 
		int i = 1;
		int j = 2;
		int k;
		k = i + j;
	//	out.println("Value of k is " + k);
	%>
	
	The value of k is: <%= k %>
	
	<% k = add(513651, 155116); %>
	The value of k is: <%= k %>
	
	<% for(i = 0; i<5; i++) {
			out.println("<br> i: " + i); 
			%>
			<br> Value of i = <%=i %>
	<% }%>
</body>
</html>