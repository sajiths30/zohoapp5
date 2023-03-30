<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Student</title>
</head>
<body>
<h2>List All Students</h2>
<table border="1">
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Email</th>
<th>Mobile</th>
<th>Cource</th>
</tr>
<c:forEach var="student" items="${students}">
<tr>
<td><a href="studentInfo?id=${student.id}">${student.firstName}</a></td>
<td>${student.lastName}</td>
<td>${student.email}</td>
<td>${student.mobile}</td>
<td>${student.cource}</td>
</tr>
</c:forEach>
</table>
</body>
</html>