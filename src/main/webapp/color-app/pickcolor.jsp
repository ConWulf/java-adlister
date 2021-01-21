<%--
  Created by IntelliJ IDEA.
  User: connorwulf
  Date: 1/21/21
  Time: 11:01 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pick Color</title>
</head>
<body>
<h1>Pick A Color</h1>
<form action="/viewcolor" method="post">
    <label for="color">Type A color:</label>
    <input type="text" id="color" name="color">
    <button>SUBMIT</button>
</form>

</body>
</html>
