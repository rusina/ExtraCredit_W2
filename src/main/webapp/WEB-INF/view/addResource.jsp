<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Resource</title>
</head>
<body>
	<h1>Add Resources</h1>
	<form:form  modelAttribute="newResources">
	 Resources Name: <form:input id="name" path="name" type="text"/><br>
	
	<br><input type="submit" id="btnAdd" value ="Add Task"/>
	
	</form:form>
</body>
</html>