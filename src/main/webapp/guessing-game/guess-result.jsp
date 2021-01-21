<%--
  Created by IntelliJ IDEA.
  User: connorwulf
  Date: 1/21/21
  Time: 1:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width,initial-scale=1.0">
    <link href="https://unpkg.com/tailwindcss@^2/dist/tailwind.min.css" rel="stylesheet">
    <title>result</title>
</head>
<body>
<c:choose>
    <c:when test="${url.equals('/incorrect')}">
        <h1 class="text-2xl text-red-300 mx-auto text-center">INCONCEIVABLE</h1>
        <h3>${num}</h3>
        <h3>${random}</h3>
    </c:when>
    <c:otherwise>
        <h1 class="text-2xl text-red-300 text-center">CORRECT</h1>
    </c:otherwise>
</c:choose>
</body>
</html>
