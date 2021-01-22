<%--
  Created by IntelliJ IDEA.
  User: connorwulf
  Date: 1/22/21
  Time: 2:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ads</title>
</head>
<body>

<c:forEach var="ad" items="${ads}">
    <div>
       <h1>${ad.title}</h1>
        <div>${ad.description}</div>
    </div>
</c:forEach>

</body>
</html>
