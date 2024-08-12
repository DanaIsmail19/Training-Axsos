<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Create New Ninja</title>
</head>
<body>
<h2>Create New Ninja</h2>
<form action="/ninjas" method="post">
    Dojo: <select name="dojoId">
    <c:forEach var="dojo" items="${dojos}">
        <option value="${dojo.id}">${dojo.name}</option>
    </c:forEach>
    </select>
    First Name: <input type="text" name="firstName" />
    Last Name: <input type="text" name="lastName" />
    Age: <input type="number" name="age" />
    <input type="submit" value="Create" />
</form>
</body>
</html>