<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>List of Dojos</title>
</head>
<body>
<h2>List of Dojos</h2>
<ul>
    <c:forEach var="dojo" items="${dojos}">
        <li><a href="/dojos/${dojo.id}">${dojo.name}</a></li>
    </c:forEach>
</ul>
</body>
</html>