<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add/Edit Book</title>
</head>
<body>
<h2>${book.id != null ? 'Edit Book' : 'Add Book'}</h2>
<form action="${book.id != null ? 'books/${book.id}/edit' : 'books'}" method="post">
    Title: <input type="text" name="title" value="${book.title}" required>
    Author: <input type="text" name="author" value="${book.author}" required>
    Thoughts: <textarea name="thoughts">${book.thoughts}</textarea>
    <button type="submit">${book.id != null ? 'Update' : 'Submit'}</button>
</form>
</body>
</html>