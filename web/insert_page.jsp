<%--
  Created by IntelliJ IDEA.
  User: lojn
  Date: 2018-12-29
  Time: 12:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="css/body.css" rel="stylesheet" type="text/css">
</head>
<body>
<div class="">
    <form action="UserInsertServlet" method="post">
        <table border="1">
            <tr>
                <td>用户名</td>
                <td><input type="text" name="username" value=""/></td>
            </tr>
            <tr>
                <td>密码</td>
                <td><input type="password" name="password" value=""/></td>
            </tr>
            <tr>
                <td>姓名</td>
                <td><input type="text" name="name" value=""/></td>
            </tr>
            <tr>
                <td>手机号码</td>
                <td><input type="text" name="phone_number" value=""/></td>
            </tr>
            <tr>
                <td>电子邮箱</td>
                <td><input type="text" name="mail" value=""/></td>
            </tr>
            <tr>
                <td><input type="submit" value="确定"/></td>
                <td><input type="reset" value="重置"/></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
