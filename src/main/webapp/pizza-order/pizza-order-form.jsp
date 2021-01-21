<%--
  Created by IntelliJ IDEA.
  User: connorwulf
  Date: 1/21/21
  Time: 11:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width,initial-scale=1.0">
    <link href="https://unpkg.com/tailwindcss@^2/dist/tailwind.min.css" rel="stylesheet">
    <title>Pizza Order</title>
</head>
<body>

<c:choose>
    <c:when test="${pageContext.request.method.equalsIgnoreCase('get')}">
        <form action="/pizza-order" method="post" class="w-11/12 max-w-xl mt-9 text-gray-800 mx-auto flex flex-col bg-gray-200 p-3 rounded-lg">
            <div class="my-2 self-center">PIZZA ORDER FORM</div>
            <label for="sauce" class="mb-1">Select Sauce</label>
            <select name="sauce" id="sauce">
                <option>Classic Tomato</option>
                <option>Pesto</option>
                <option>White Garlic</option>
                <option>Bechamel</option>
            </select>
            <label for="crust" class="mt-2 mb-1">Select Crust</label>
            <select name="crust" id="crust">
                <option>Thin</option>
                <option>Wheat</option>
                <option>Classic</option>
                <option>Stuffed</option>
            </select>
            <label for="size" class="mt-2 mb-1">Select Size</label>
            <select name="size" id="size">
                <option>Personal</option>
                <option>Medium</option>
                <option>Large</option>
                <option>For The Table</option>
            </select>
            <div class="my-3 flex flex-col">
                <label for="Peperoni">
                    <input type="checkbox" value="Peperoni" id="Peperoni" name="toppings">
                    Peperoni
                </label>
                <label for="Mushrooms">
                    <input type="checkbox" value="Mushrooms" id="Mushrooms" name="toppings">
                    Mushrooms
                </label>
                <label for="Bell Pepper">
                    <input type="checkbox" value="Bell Pepper" id="Bell Pepper" name="toppings">
                    Bell Pepper
                </label>
                <label for="Basil">
                    <input type="checkbox" value="Basil" id="Basil" name="toppings">
                    Basil
                </label>
            </div>
            <label for="address" class="mb-1">Address: </label>
            <input type="text" name="address" id="address">
            <button class="p-2 bg-green-400 mt-2 rounded-lg">Make Order</button>
        </form>
    </c:when>
    <c:otherwise>
        <div class="w-11/12 bg-indigo-300 mx-auto py-2 rounded-xl text-center mt-5">
            <h1 class="my-2">Your Pizza</h1>
            <div>
                <div class="p-3">
                    <span>Toppings: </span>
                   <c:forEach var="topping" items="${toppings}">
                       <span class="hover:bg-indigo-200 cursor-pointer p-2">${topping}</span>
                   </c:forEach>
                </div>
               <div>Sauce - Size - Crust:</div>
               <c:forEach var="unit" items="${pizza}">
                   <div class="hover:bg-indigo-200 cursor-pointer p-2">${unit}</div>
               </c:forEach>
                <span>Send To:</span>
                <span class="mt-3 hover:bg-indigo-200 cursor-pointer p-2">${address}</span>
            </div>
        </div>
    </c:otherwise>
</c:choose>


</body>
</html>
