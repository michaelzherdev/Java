<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href = "mainServlet">Hello!</a>
<table>
	<tr>
		<td>ID</td>
		<td>Title</td>
		<td>Description</td>
		<td>ISBN</td>
	</tr>
	<c:forEach items="$(books)" var="book">
	<tr>
		<td>$(book.id)</td>
		<td>$(book.title)</td>
		<td>$(book.description)</td>
		<td>$(book.isbn)</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>