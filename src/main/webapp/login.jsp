<%--
  Created by IntelliJ IDEA.
  User: connorwulf
  Date: 1/19/21
  Time: 4:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <title>login</title>
</head>
<body>
<%@include file="partials/navbar.jsp"%>
    <form class="login-card" method="post" action="login.jsp">
        <label for="username">USERNAME:</label>
        <input type="text" id="username" name="username">

        <label for="password">PASSWORD:</label>
        <input type="password" id="password" name="password">

        <button class="login-btn">Login</button>
    </form>
<%--<c:if test="${pageContext.request.method.equalsIgnoreCase('post')}">--%>
    <c:if test="${param.username.equals(\"admin\") && param.password.equals(\"password\")}">
       <% response.sendRedirect("profile.jsp"); %>
    </c:if>
<%--</c:if>--%>

<%@include file="partials/footer.jsp"%>
<%
//    if (request.getMethod().equalsIgnoreCase("post")) {
//        if (request.getParameter("password").equals("password")
//        && request.getParameter("username").equals("admin")) response.sendRedirect("/profile");
//    }
%>

</body>
</html>
<style>
    .login-card {
        margin: 2rem auto;
        display: flex;
        flex-direction: column;
        max-width: 400px;
        padding: 3rem;
        background: #898989;
        border-radius: 2rem;
    }
    #username,
    #password {
        padding: 0.5rem;
    }
    #username {
        margin-bottom: 2rem;
    }
    label {
        padding: 1rem 0;
        color: #232323;
    }
    .login-btn {
        padding: 0.5rem;
        background: rgb(100, 200, 150);
        font-size: large;
        margin-top: 0.5rem;
    }
</style>