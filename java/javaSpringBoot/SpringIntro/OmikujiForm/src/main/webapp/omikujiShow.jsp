<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>OmikujiShow</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 50px;
        }
        .fortune-box {
            background-color: lightblue;
            padding: 20px;
            border: 1px solid blue;
            width: 300px;
        }
    </style>
</head>
<body>
    <h1>Here's YourOmikuji!</h1>
    <div class="fortune-box">
        <p>In 10 years, you will live in <span th:text="${city}">city</span> with <span th:text="${person}">person</span> as your roommate, <span th:text="${hobby}">hobby</span> for a living. The next time you see a <span th:text="${livingThing}">living thing</span>, you will have good luck. Also, <span th:text="${compliment}">compliment</span></p>
    </div>
    <a href="/omikuji">Go Back</a>
</body>
</html>