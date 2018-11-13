<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Scheduled Sessions </title>
</head>
<body>
<h1> Scheduled Sessions </h1>
<br>
<table ">
<tr>
<th> Session Name </th>
<th> Duration (Days) </th>
<th> Faculty </th>
<th> Mode </th>
<th></th>
</tr>
<a:forEach var = "sessions" items = "${data}">
<tr>
<td> ${sessions.name} </td>
<td> ${sessions.duration} </td>
<td> ${sessions.faculty} </td>
<td> ${sessions.mode} </td>
<td> <a href = "Success?sessionName=${sessions.name}" > Enroll Me </a> </td>
</tr>
</a:forEach>
</table>
</body>
</html>