<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 2/18/2022
  Time: 10:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Calculator</h1>
<form action="/add" method="get">
    <input type="text" placeholder="Number1" name="num1">
    <input type="text" placeholder="Number2" name="num2">
    <button type="submit">add</button>
    <a href="/sub">SUB(-)</a>
    <a href="/multi">MULTI(x)</a>
    <a href="/division">DIVISION(/)</a>
</form>
</body>
</html>
