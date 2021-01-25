<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="IdeaProjects/java-adlister/src/main/webapp/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Admin Dashboard" />
    </jsp:include>
</head>
<body>
    <jsp:include page="IdeaProjects/java-adlister/src/main/webapp/WEB-INF/partials/navbar.jsp" />

    <div class="container">
        <h1>Viewing admin dashboard.</h1>
        <p>Is Admin: ${sessionScope.isAdmin}</p>
    </div>

</body>
</html>
