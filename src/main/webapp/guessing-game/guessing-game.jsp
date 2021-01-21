<%--
  Created by IntelliJ IDEA.
  User: connorwulf
  Date: 1/21/21
  Time: 1:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width,initial-scale=1.0">
    <link href="https://unpkg.com/tailwindcss@^2/dist/tailwind.min.css" rel="stylesheet">
    <title>Guess</title>
</head>
<body>

<form action="guess" method="post" class="max-w-lg bg-gray-300 p-2 mx-auto my-6">
    <label for="num">enter a number between 1 and 3:</label>
    <input type="number" id="num" name="num">
    <button class="bg-green-300 p-2">Submit Number</button>
</form>

</body>
</html>
