<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 2/16/2022
  Time: 6:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/controller" method="post">
   USD: <input type="text" placeholder="USD" name="usd">
    RATE: <input type="text" placeholder="RATE" name="rate">
    <button type="submit"> Convert</button>
</form>
<h1>RESULT: ${result}</h1>
</body>
</html>
