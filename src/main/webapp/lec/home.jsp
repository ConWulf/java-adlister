<%--
  Created by IntelliJ IDEA.
  User: connorwulf
  Date: 1/19/21
  Time: 3:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%! int pageNum = 1; %>
<html>
<head>
    <title>Home Page</title>
</head>
<body>
<%@include file="IdeaProjects/java-adlister/src/main/webapp/partials/navbar.jsp"%>
    <h1>Hello Jupiter</h1>
<p>page number is: <%= pageNum %></p>
<%--jsp comment--%>
<!--html comment-->
    <form action="IdeaProjects/java-adlister/src/main/webapp/lec/user-profile.jsp" method="get">
        <label for="username">USERNAME</label><input type="text" id="username" name="username">
        <button>Sign In</button>
    </form>
    <form action="IdeaProjects/java-adlister/src/main/webapp/lec/todo.jsp" method="post">
        <label for="item">item</label><input type="text" id="item" name="item">
        <button>Add</button>
    </form>
<%@include file="IdeaProjects/java-adlister/src/main/webapp/partials/footer.jsp"%>
</body>
</html>
