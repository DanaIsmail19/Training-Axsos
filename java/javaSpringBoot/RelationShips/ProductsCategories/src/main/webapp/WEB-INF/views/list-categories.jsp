<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>List of Categories</title>
</head>
<body>
<h2>Categories</h2>
<a href="${pageContext.request.contextPath}/categories/new">New Category</a>
<table border="1">
    <tr>
        <th>Name</th>
        <th>Actions</th>
    </tr>
    <c:forEach items="${categories}" var="category">
        <tr>
            <td>${category.name}</td>
            <td><a href="${pageContext.request.contextPath}/categories/${category.id}">View</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>