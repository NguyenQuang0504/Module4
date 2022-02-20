<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 2/19/2022
  Time: 4:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        input{
            width: 100%;
            height: 40px;
        }
        p {
            color: red;
        }
    </style>
</head>
<body>
<center>
<h1>Tờ khai y tế</h1>
<form:form action="/save" method="post" modelAttribute="person">
    <span>Ho va ten: </span>
    <form:input path="name"/>
    <span>Ngay thang nam sinh: </span>
    <form:input type="date" path="date"/>
    <span>Gioi tinh</span>
    <form:select path="gender">
        <form:option value="Nam">Nam</form:option>
        <form:option value="Nu">Nu</form:option>
    </form:select>
    <span>Quoc gia</span>
    <form:select path="country">
        <form:option value="Viet Nam">Viet Nam</form:option>
        <form:option value="USA">USA</form:option>
        <form:option value="China">China</form:option>
        <form:option value="Laos">Laos</form:option>
        <form:option value="Other">Other</form:option>
    </form:select>
    <span>So cccd/cmnd:</span>
    <form:input path="cccd"/>
    <span>Thong tin di lai:</span>
    <form:input path="go"/>
    <span>So hieu phuong tien:</span>
    <form:input path="seriVehicle"/>
    <span>So ghe:</span>
    <form:input path="numChair"/>
    <span>Ngay khoi hanh:</span>
    <form:input type="date" path="dateStart"/>
    <span>Ngay ket thuc:</span>
    <form:input path="dateEnd"/>
    <span>Trong vong 14 ngay anh/chi di den tinh thanh pho nao?</span>
    <form:input path="note" />
    <span>Tinh thanh pho: </span>
    <form:input path="city"/>
    <span>Quan/Huyen:</span>
    <form:input path="district"/>
    <span>Xa/Phuong/Thi tran: </span>
    <form:input path="commune"/>
    <span>Dia chi tam tru:</span>
    <form:input path="address"/>
    <span>So dien thoai:</span>
    <form:input path="phone"/>
    <span>Email:</span>
    <form:input path="email"/>
    <span>Trieu chung:</span>
    <form:input path="symptom"/>
    <span>Trong vong 14 ngay qua anh/chi co:</span>
    <span>Den trang trai chan nuoi/ cho buon ban dong vat tuoi song/ tiep xuc dong vat?</span>
<%--    <form:input type="radio" name="note1" value="Yes" path=""/>Co--%>
<%--    <form:input type="radio" name="note1" path="infection"/>Khong--%>
    <form:button type="submit">Save</form:button>
</form:form>
</center>
</body>
</html>
