<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>List of Products</title>
</head>
<body>
<h2>Products</h2>
<a href="${pageContext.request.contextPath}/products/new">New Product</a>
<table border="1">
    <tr>
        <th>Name</th>
        <th>Description</th>
        <th>Price</th>
        <th>Actions</th>
    </tr>
    <c:forEach items="${products}" var="product">
        <tr>
            <td>${product.name}</td>
            <td>${product.description}</td>
            <td>${product.price}</td>
            <td><a href="${pageContext.request.contextPath}/products/${product.id}">View</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>