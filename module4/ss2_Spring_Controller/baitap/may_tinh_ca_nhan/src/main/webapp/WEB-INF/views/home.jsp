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
<form action="/calculator" method="get">
    <input type="text" placeholder="Number1" name="num1">
    <input type="text" placeholder="Number2" name="num2">
    <input type="submit" value="add" name="calculator" placeholder="ADD">
    <input type="submit" value="sub" name="calculator" placeholder="SUB">
    <input type="submit" value="multi" name="calculator" placeholder="Multi">
    <input type="submit" value="division" name="calculator" placeholder="DIVISION">
</form>
<h1 style="color: red">Result: ${result}</h1>
</body>
</html>
