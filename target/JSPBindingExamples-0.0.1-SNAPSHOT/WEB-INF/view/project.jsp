<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- <p>Add Project</p> -->
<%-- <form:form action="GET" action="addProject" modelAttribute="project"> --%>

<%-- <form:input path="project" id="project"/>
<form:label path="name">Project Name:</form:label> --%>

<form:form  modelAttribute="myProject">
	Project Name: <form:input id="name" path="name" type="text"/><br>
	Project Description: <form:input id="description" path="description" type="text"/><br>
	Project Start Date: <form:input id="startDate" path="startDate" type= "text"/><br>
	Project End Date: <form:input id="endDate" path="endDate" type= "text"/><br> 
	
	<br><input type="submit" id="addBtn" value ="Add Project"/>
	
	</form:form>
</body>
</html>