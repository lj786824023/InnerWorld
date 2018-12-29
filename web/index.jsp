<%--
  Created by IntelliJ IDEA.
  User: lojn
  Date: 2018-12-06
  Time: 20:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index.jsp</title>
    <link rel="stylesheet" href="./css/index.css" type="text/css">
    <script src="js/index.js" type="text/javascript" charset="UTF-8"></script>
</head>
<body>
<div class="div-index">
    <div class="div-head">
        <!-- <iframe frameborder="none" scrolling="auto" src="head.jsp"></iframe> -->
        <p>欢迎你！</p>
        <input type="button" id="select" value="查询" onclick="select_page()"/>
        <input type="button" id="insert" value="添加" onclick="insert_page()"/>
        <input type="button" id="update" value="修改" onclick=""/>
        <input type="button" id="delete" value="删除" onclick=""/>
    </div>
    <div class="div-body">
        <iframe src="body.jsp" id="iframe_body" frameborder="none" scrolling="auto"></iframe>
    </div>
</div>
</body>
</html>
