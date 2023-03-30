<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Student</title>
</head>
<body>
<h2>Create | Student</h2>
<form action="saveStudent" method="post">
<pre>
First Name<input type="text" name="firstName"/>
Last Name<input type="text" name="lastName"/>
Email<input type="text" name="email"/>
Mobile<input type="text" name="mobile"/>
Cource:
<select name="cource">
  <option value="B.com">B.com</option>
  <option value="B.Tech">B.Tech</option>
  <option value="M.com">M.com</option>
  <option value="M.tech">M.Tech</option>
  <option value="Diploma">Diploma</option>
</select>
<input type="submit" value="Save">
</pre>
</form>
${msg}
</body>
</html>