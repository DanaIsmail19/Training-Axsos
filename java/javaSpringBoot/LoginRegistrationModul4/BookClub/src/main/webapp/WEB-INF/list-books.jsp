<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Book List</title>
</head>
<body>
<h2>Books</h2>
<c:forEach items="${books}" var="book">
    <p>Title: ${book.title} by ${book.author}</p>
    <a href="books/${book.id}/edit">Edit</a>
    <a href="books/${book.id}/delete">Delete</a>
</c:forEach>
<a href="${pageContext.request.contextPath}/books/new">Add a New Book</a>
</body>