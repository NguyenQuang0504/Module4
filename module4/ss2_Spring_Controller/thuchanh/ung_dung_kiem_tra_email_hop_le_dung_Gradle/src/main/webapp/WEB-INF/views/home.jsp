<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 2/17/2022
  Time: 8:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
<h1>Check Email!!!</h1>
    <form action="check" method="post">
        Email: <input type="text" placeholder="Email" name="email">
        <button type="submit">Check</button>
    </form>
    <h1 style="color: red" >${mess}</h1>
</center>
</body>
</html>
