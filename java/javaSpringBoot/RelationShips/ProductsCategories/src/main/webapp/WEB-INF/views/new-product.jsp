<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add New Product</title>
</head>
<body>
<h2>Add New Product</h2>
<form action="${pageContext.request.contextPath}/products" method="post">
    Name: <input type="text" name="name" />
    Description: <textarea name="description"></textarea>
    Price: <input type="text" name="price" />
    <input type="submit" value="Submit" />
</form>
</body>