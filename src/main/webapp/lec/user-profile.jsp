<%--
  Created by IntelliJ IDEA.
  User: connorwulf
  Date: 1/19/21
  Time: 3:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h2>
    hello
    <%= request.getParameter("username")%>
</h2>

</body>
</html>
