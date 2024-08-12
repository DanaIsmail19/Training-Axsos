<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h2>Login</h2>
<form action="${pageContext.request.contextPath}/users/login" method="post">
    Email: <input type="text" name="email" required>
    Password: <input type="password" name="password" required>
    <button type="submit">Login</button>
</form>
</body>
</html>