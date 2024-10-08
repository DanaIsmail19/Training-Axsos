<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<title>Books</title>
</head>
<body style="margin: 24px">


<h1>All Books</h1>
<table class="table table-striped table-bordered">
    <thead>
        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Language</th>
            <th># Pages</th>
        </tr>
    </thead>
    <tbody>
		<c:forEach var="book" items="${books}">
			<tr>
				<td><c:out value="${books.id}"></c:out></td>
				<td><a href="/books/${books.id}"><c:out value="${book.title}"></c:out></a></td>
				<td><c:out value="${books.language}"></c:out></td>
				<td><c:out value="${books.numberOfPages}"></c:out></td>
			</tr>	
		</c:forEach>
    </tbody>
</table>
</body>
</html>