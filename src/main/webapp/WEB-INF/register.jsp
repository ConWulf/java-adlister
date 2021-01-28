<%--
  Created by IntelliJ IDEA.
  User: connorwulf
  Date: 1/28/21
  Time: 11:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/register" method="POST">
    <label for="username">USERNAME</label>
    <input type="text" id="username" name="username" required>
    <label for="password">PASSWORD</label>
    <input type="password" id="password" name="password" required>
    <label for="email">EMAIL</label>
    <input type="email" id="email" name="email" required>
    <button>Register</button>
</form>

</body>
</html>
