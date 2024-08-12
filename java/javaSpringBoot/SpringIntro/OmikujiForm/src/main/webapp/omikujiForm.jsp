<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>OmikujiForm</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 50px;
        }
        form {
            display: flex;
            flex-direction: column;
            width: 300px;
        }
        input, textarea {
            margin-bottom: 10px;
            padding: 5px;
        }
        button {
            padding: 10px;
        }
    </style>
</head>
<body>
    <h1>Send an Omikuji!</h1>
    <form action="/omikuji/process" method="post">
        <label>Pick any number from 5 to 25
            <input type="number" name="number" min="5" max="25" required>
        </label>
        <label>Enter the name of any city
            <input type="text" name="city" required>
        </label>
        <label>Enter the name of any real person
            <input type="text" name="person" required>
        </label>
        <label>Enter professional endeavor or hobby
            <input type="text" name="hobby" required>
        </label>
        <label>Enter any type of living thing
            <input type="text" name="livingThing" required>
        </label>
        <label>Say something nice to someone
            <textarea name="compliment" rows="3" required></textarea>
        </label>
        <button type="submit">Send</button>
    </form>
</body>
</html>