<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ADMISSION</title>
</head>
<body>
	<h1>ADMISSION SUCCESS!</h1>
	<h2>${msg}</h2>
	
	<table>
		<tr>
			<td>Student`s name: </td>
			<td>${student.studentName}</td>
		</tr>
		<tr>
			<td>Student`s hobby: </td>
			<td>${student.studentHobby}</td>
		</tr>
		<tr>
			<td>Student`s mobile: </td>
			<td>${student.studentMobile}</td>
		</tr>
		<tr>
			<td>Student`s date of birth: </td>
			<td>${student.studentDOB}</td>
		</tr>
		<tr>
			<td>Student`s skills: </td>
			<td>${student.studentSkills}</td>
		</tr>
		<tr>
			<td>Student`s address: </td>
			<td>country: ${student.studentAddress.country}
				city: ${student.studentAddress.city}
				street: ${student.studentAddress.street}
				pin: ${student.studentAddress.pincode}</td>
		</tr>
	</table>
</body>
</html>