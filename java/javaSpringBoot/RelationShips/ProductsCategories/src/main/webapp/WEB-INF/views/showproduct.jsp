<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Product Details</title>
</head>
<body>
<h2>${product.name}</h2>
<p>Description: ${product.description}</p>
<p>Price: ${product.price}</p>
<h3>Categories:</h3>
<ul>
    <c:forEach items="${categories}" var="category">
        <li>${category.name}</li>
    </c:forEach>
</ul>
</body>