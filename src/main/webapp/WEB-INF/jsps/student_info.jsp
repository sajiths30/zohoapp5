<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Info</title>
</head>
<body>
<h2>Student Info</h2>
First Name:${student.firstName}<br/>
Last Name:${student.lastName}<br/>
Email:${student.email}<br/>
Mobile:${student.mobile}<br/>
Cource:${student.cource}<br/>
<form action="convertStudent" method="post">
<input type="hidden" name="id" value="${student.id}"/>
<input type="submit" value="convert"/>
</form>
<form action="composeEmail" method="post">
<input type="hidden" name="email" value="${student.email}"/>
<input type="submit" value="Email"/>
</form>
</body>
</html>