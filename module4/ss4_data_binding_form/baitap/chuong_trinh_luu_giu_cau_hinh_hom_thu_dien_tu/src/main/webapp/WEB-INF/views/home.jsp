<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 2/20/2022
  Time: 8:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Setting</h1>
<form:form action="/result" method="post" modelAttribute="model">
    <span>Language</span> 
    <form:select path="language">
        <form:option value="English">English</form:option>
        <form:option value="Vietnamese">Vietnamese</form:option>
        <form:option value="Japanese">Japanese</form:option>
        <form:option value="Chinese">Chinese</form:option>
    </form:select>
    <lable>
        <br>
    <span>Page size  Show: </span>
        <form:select path="pageSize">
            <form:option value="5">5</form:option>
            <form:option value="10">10</form:option>
            <form:option value="15">15</form:option>
            <form:option value="25">25</form:option>
            <form:option value="50">50</form:option>
            <form:option value="100">100</form:option>
        </form:select>
        <span>email per page</span>
    </lable>
    <br>
    <span>Spams filter</span>
    <form:checkbox path="spam" value="Enable spams filter"/> Enable spams filter!
    <br>
    <form:textarea path="signature"/>
    <br>
    <form:button type="submit">Upload</form:button>
        <form:button ><a href="/home">Cancel</a></form:button>
<%--    <form:button type="submit">Cancel</form:button>--%>
</form:form>
</body>
</html>
