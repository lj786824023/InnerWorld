<%@ page import="entity.User" %>
<%@ page import="java.util.List" %>
<%@ page import="dao.UserDao" %>
<%@ page import="dao.UserDaoImpl" %>
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
    <script src="js/index.js" type="text/javascript" charset="UTF-8"></script>
    <title>Title</title>
</head>
<body>
<div class="">
    <form action="UserUpdateServlet" method="post">
        <table border="1">
            <tr>
                <td>用户名</td>
                <td>密码</td>
                <td>姓名</td>
                <td>电话号码</td>
                <td>电子邮箱</td>
                <td>操作</td>
            </tr>
            <%
                UserDao userDao = new UserDaoImpl();
                List<User> userList = userDao.SelectAll();
                for (User u : userList) {
            %>
            <tr>
                <td><input type="text" id="username<%=u.getUsername()%>" name="username" value="<%=u.getUsername()%>" readonly disabled/>
                </td>
                <td><input type="text" id="password<%=u.getUsername()%>" name="password" value="<%=u.getPassword()%>" disabled/>
                </td>
                <td><input type="text" id="name<%=u.getUsername()%>" name="name" value="<%=u.getName()%>" disabled/>
                </td>
                <td><input type="text" id="phone_number<%=u.getUsername()%>" name="phone_number" value="<%=u.getPhone_number()%>" disabled/>
                </td>
                <td><input type="text" id="mail<%=u.getUsername()%>" name="mail" value="<%=u.getMail()%>" disabled/>
                </td>
                <td>
                    <input type="button" value="删除"
                           onclick="javascript:location.href='UserDeleteServlet?username=<%=u.getUsername()%>'"/>
                    <input type="button" value="编辑" onclick="edit('<%=u.getUsername()%>')"/>
                    <input type="hidden" id="commit<%=u.getUsername()%>" value="确定"/>
                    <input type="hidden" id="cancel<%=u.getUsername()%>" value="取消" onclick="cancel('<%=u.getUsername()%>')"/>
                </td>
            </tr>
            <%}%>
        </table>
    </form>
</div>
</body>
</html>