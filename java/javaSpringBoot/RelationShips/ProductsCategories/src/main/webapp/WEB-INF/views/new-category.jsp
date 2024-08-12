<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add New Category</title>
</head>
<body>
<h2>Add New Category</h2>
<form action="${pageContext.request.contextPath}/categories" method="post">
    Name: <input type="text" name="name" />
    <input type="submit" value="Submit" />
</form>
</body>
</html>