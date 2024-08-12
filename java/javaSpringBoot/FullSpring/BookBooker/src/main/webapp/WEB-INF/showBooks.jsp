<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Book Details</title>
</head>
<body>
    <h1>${book.title}</h1>
    <p><strong>Author:</strong> ${book.author}</p>
    <p><strong>Thoughts:</strong> ${book.thoughts}</p>
    <p><strong>Owner:</strong> ${book.owner.username}</p>
    <c:if test="${not empty book.borrower}">
        <p><strong>Borrower:</strong> ${book.borrower.username}</p>
    </c:if>
    <a href="/books">Back to All Books</a>
    <a href="/bookmarket">Back to Book Market</a>
</body>
</html>