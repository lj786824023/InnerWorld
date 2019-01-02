<%@ page import="entity.User" %>
<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: lojn
  Date: 2018-12-29
  Time: 12:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="./css/body.css" rel="stylesheet" type="text/css">
    <title>Title</title>
</head>
<body>
<div class="div-select">
    <table border="1">
        <tr>
            <td>用户吗</td>
            <td>密码</td>
            <td>姓名</td>
            <td>电话号码</td>
            <td>电子邮箱</td>
            <td>操作</td>
        </tr>
        <%
            List<User> userList = (List<User>) request.getSession().getAttribute("userList");
            for (User u : userList) {
        %>
        <tr>
            <td><%=u.getUsername() %>
            </td>
            <td><%=u.getPassword() %>
            </td>
            <td><%=u.getName() %></td>
            <td><%=u.getPhone_number() %>
            </td>
            <td><%=u.getMail() %>
            </td>
            <td>删除</td>
        </tr>
        <%}%>
    </table>
</div>
</body>
</html>