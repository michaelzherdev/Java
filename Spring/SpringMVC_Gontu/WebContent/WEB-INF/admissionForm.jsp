<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ADMISSION</title>
</head>
<body>
	<h1>ADMISSION FORM</h1>
	<form:errors path="student.*"/>
	<form action="/GontuSpringMVC/submit.html" method="post">
		Name: <input type="text" name="studentName" /><br>
		Hobby: <input type="text" name="studentHobby" /><br>
		Mobile: <input type="text" name="studentMobile" /><br>
		Date of birth: <input type="text" name="studentDOB" /><br>
		Skills: <select name="studentSkills" multiple="multiple">
					<option value="Java Core">Java Core</option>
					<option value="Spring Core">Spring Core</option>
					<option value="Spring MVC">Spring MVC</option>
				</select><br>
		<input type="submit" value="Submit">
		
		<table>
		<tr>
			<td>Country: <input type="text" name="studentAddress.country" /></td>
			<td>City: <input type="text" name="studentAddress.city" /></td>
			<td>Street: <input type="text" name="studentAddress.street" /></td>
			<td>PIN: <input type="text" name="studentAddress.pincode" /></td>
		</tr>
	</table>
	</form>

</body>
</html>