<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
<h2>Register</h2>
<form action="${pageContext.request.contextPath}/users/register" method="post">
    Name: <input type="text" name="name" required>
    Email: <input type="email" name="email" required>
    Password: <input type="password" name="password" required>
    Confirm Password: <input type="password" name="confirmPassword" required>
    <button type="submit">Register</button>
</form>