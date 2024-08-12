<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html >
<head>
    <title>Counter Page</title>
</head>
<body>
    <h1>Counter Page</h1>
    <p>You have visited <a href="/"><c:out value="${page}"/></a> <c:out value="${count}"/> times.</p>
    <a href="/">Go back to home</a>
</body>
</html>