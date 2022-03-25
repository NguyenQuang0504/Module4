<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 3/25/2022
  Time: 8:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h3>Home</h3>
<%--@elvariable id="login" type="com"--%>
<form:form action="login" method="post" modelAttribute="login">
    <fieldset>
        <legend>Login</legend>
        <table>
            <tr>
                <td><form:label path="account">Account:</form:label></td>
                <td><form:input path="account"/></td>
            </tr>
            <tr>
                <td><form:label path="password">Password:</form:label></td>
                <td><form:input path="password"/></td>
            </tr>
            <tr>
                <td></td>
                <td><form:button>Login</form:button></td>
            </tr>
        </table>
    </fieldset>
</form:form>

<form:form action="employee/showform" method="get">
    <input type="submit" value="Submit">
</form:form>

<%--@elvariable id="setting" type="com"--%>
<h1>Settings</h1>
<form:form action="/e-mail" modelAttribute="setting" method="post">
    <table>
        <tr>
            <td>Languages : </td>
            <td><input type="text" name="languages"></td>
        </tr>
        <tr>
            <td>Page Sizes : </td>
            <td>Show <select name="sizes" >
                <option value="20">20</option>
                <option value="25">25</option>
                <option value="30">30</option>
            </select>
            </td>
        </tr>
        <tr>
            <td>Signature : </td>
            <td><label>
                <textarea></textarea>
            </label></td>
        </tr>
        <tr>
            <td><input type="submit" value="update"></td>
            <td><button value="cancel">Cancel</button> </td>
        </tr>
    </table>
</form:form>
</body>
</html>
