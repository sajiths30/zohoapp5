<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Details</title>
</head>
<body>
<h2>Create | Details</h2>
<form action="saveDetails" method="post">
<pre>
First Name<input type="text" name="firstName" value="${batch.firstName}"/>
Last Name<input type="text" name="lastName" value="${batch.lastName}"/>
Email<input type="text" name="email" value="${batch.email}"/>
Mobile<input type="text" name="mobile" value="${batch.mobile}"/>
Cource<input type="text" name="cource" value="${batch.cource}"/>
Batch<input type="text" name="batch"/>
College<input type="text" name="college"/>
<input type="submit" value="Save">
</pre>
</form>
${msg}
</body>
</html>