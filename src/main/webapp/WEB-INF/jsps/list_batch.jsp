<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Batch</title>
</head>
<body>
<h2>List All Batches</h2>
<table border="1">
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Email</th>
<th>Mobile</th>
<th>Cource</th>
<th>Details</th>
</tr>
<c:forEach var="batch" items="${batches}">
<tr>
<td><a href="batchInfo?id=${batch.id}">${batch.firstName}</a></td>
<td>${batch.lastName}</td>
<td>${batch.email}</td>
<td>${batch.mobile}</td>
<td>${batch.cource}</td>
<td><a href="createDetails?id=${batch.id}">Details</a>
</tr>
</c:forEach>
</table>
</body>
</html>