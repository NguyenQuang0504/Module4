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
        table{
            border: 1px solid black;
            border-collapse: collapse;
        }
        th, td, tr {
            border: 1px solid black;
            border-collapse: collapse;
        }
        input{
            margin-bottom: 25px;
        }
        span {
            color: red;
            font-weight: 500;
            font-size: 20px;
            margin-top: 30px;
        }
        button{
            height: 30px;
            background-color: blue;
            color: aliceblue;
            text-align: center;
            width: 100px;
            margin-top: 30px;
            position: absolute;
            right: 50%;
        }
    </style>
</head>
<body>
<h1 style="text-align: center">Tờ khai y tế</h1>
<form:form action="/save" method="post" modelAttribute="person">
    <span>Ho va ten: </span>
    <form:input cssStyle="width: 100%; height: 40px" path="name"/>
    <span>Ngay thang nam sinh: </span>
    <form:input cssStyle="width: 100%; height: 40px" type="date" path="date"/>
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
    <br>
    <span>So cccd/cmnd:</span>
    <form:input cssStyle="width: 100%; height: 40px" path="cccd"/>
    <div>
    <span>Thong tin di lai:</span>
    <form:radiobutton value="Tau bay" path="go"/>Tau bay
    <form:radiobutton path="go" value="Tau thuyen" /> Tau thuyen
    <form:radiobutton path="go" value="Oto"/>Oto
    <form:radiobutton path="go" value="Khac"/>Khac
    </div>
    <br>
    <span>So hieu phuong tien:</span>
    <form:input cssStyle=" height: 40px" path="seriVehicle"/>
    <span>So ghe:</span>
    <form:input cssStyle="height: 40px" path="numChair"/>
    <br>
    <span>Ngay khoi hanh:</span>
    <form:input cssStyle="width: 40%; height: 40px" type="date" path="dateStart"/>
    <span>Ngay ket thuc:</span>
    <form:input cssStyle="width: 40%; height: 40px" type="date" path="dateEnd"/>
    <br>
    <span>Trong vong 14 ngay anh/chi di den tinh thanh pho nao?</span>
    <form:input cssStyle="width: 100%; height: 40px" path="note" />
    <br>
    <span>Tinh thanh pho: </span>
    <form:input cssStyle="width: 20%; height: 40px" path="city"/>
    <span>Quan/Huyen:</span>
    <form:input cssStyle="width: 20%; height: 40px" path="district"/>
    <span>Xa/Phuong/Thi tran: </span>
    <form:input cssStyle="width: 20%; height: 40px" path="commune"/>
    <br>
    <span>Dia chi tam tru:</span>
    <form:input cssStyle="width: 100%; height: 40px" path="address"/>
    <br>
    <span>So dien thoai:</span>
    <br>
    <form:input cssStyle="width: 100%; height: 40px" path="phone"/>
    <br>
    <span>Email:</span>
    <br>
    <form:input cssStyle="width: 100%; height: 40px" path="email"/>
    <br>
    <span>Lich su phoi nhiem: Trong vong 14 ngay qua, Anh/Chi co:</span>
    <br>
    <table>
        <tr>
            <th></th>
            <th>Co</th>
            <th>Khong</th>
        </tr>
        <tr>
            <td>
                <span>Den trang trai chan nuoi/ cho dong vat tuoi song/ co so giet mo dong vat/ tiep xuc dong vat</span>
            </td>
            <td>
                <form:radiobutton path="infection.infection1" value="Den trang trai chan nuoi/ cho dong vat tuoi song/ co so giet mo dong vat/ tiep xuc dong vat"/> Yes
            </td>
            <td>
                <form:radiobutton path="infection.infection1" value=""/> No
            </td>
        </tr>
        <tr>
            <td>
                <span>Tiep xuc gan(<2m) voi nguoi mac benh viem duong ho hap do nCoV</span>
            </td>
            <td>
                 <form:radiobutton path="infection.infection2" value="Tiep xuc gan(<2m) voi nguoi mac benh viem duong ho hap do nCoV"/> Yes
            </td>
            <td>
                <form:radiobutton path="infection.infection2" value=""/>No
            </td>
        </tr>
    </table>
    <form:button id="button" type="submit">Save</form:button>
</form:form>
</body>
</html>
