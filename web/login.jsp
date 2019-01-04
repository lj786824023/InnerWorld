<%--
  Created by IntelliJ IDEA.
  User: lojn
  Date: 2018-12-06
  Time: 20:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login.jsp</title>
    <link rel="stylesheet" href="./css/login.css" type="text/css">
</head>
<body class="body-login">
<div style="border: 1px solid gray;height: 100%;">
    <div style="height: 30%;"></div>
    <div class="div-login">
        <form action="LoginServlet" method="post">
            <table style="margin: 0 auto;">
                <tr>
                    <td>用户名：</td>
                    <td><input type="text" id="username" name="username"/></td>
                </tr>
                <tr>
                    <td>密码：</td>
                    <td><input type="password" id="password" name="password"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="登陆"></td>
                    <td><input type="reset" value="重置"></td>
                </tr>
            </table>
        </form>
    </div>
</div>
</body>
</html>