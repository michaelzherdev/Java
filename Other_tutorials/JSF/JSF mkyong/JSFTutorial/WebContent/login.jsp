<%@taglib uri="http://java.sun.com/jsf/html" prefix="h"%><%@taglib
	uri="http://java.sun.com/jsf/core" prefix="f"%><%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSF Tutorial</title>

</head>
<body>

<f:view>
	<f:loadBundle basename="com.tutorial.messages" var="msg"/>
	<h:messages></h:messages>
	<h:form>
		<h:panelGrid border="1" columns="2">
			<h:outputText value="#{msg.name}"></h:outputText>
			<h:inputText value="#{loginBean.name}"></h:inputText>
			<h:outputText value="#{msg.password}">Password</h:outputText>
				<h:inputSecret value="#{loginBean.password}">
				 <f:validator validatorId="com.tutorial.ValidatePassword" />
				</h:inputSecret>
		</h:panelGrid>
	<h:commandButton value="Login" action="login"></h:commandButton>
		</h:form></f:view></body>
</html>