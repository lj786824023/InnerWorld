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
        <p>欢迎你！</p>
    </div>
    <div class="div-index-list">
        <input type="button" id="bt1" value="查询" onclick="select_page()"/>
        <input type="button" id="bt2" value="添加" onclick="insert_page()"/>
        <input type="button" id="bt3" value="修改" onclick=""/>
        <input type="button" id="bt4" value="删除" onclick=""/>
    </div>
    <div class="div-left">
        <ul>
            <li><input type="button" id="select" value="查询" onclick="select_page()"/></li>
            <li><input type="button" id="insert" value="添加" onclick="insert_page()"/></li>
            <li><input type="button" id="update" value="修改" onclick=""/></li>
            <li><input type="button" id="delete" value="删除" onclick=""/></li>
        </ul>
    </div>
    <div class="div-right">
        <iframe class="iframe-body" src="body.jsp" id="iframe_body" frameborder="0" scrolling="none"></iframe>
    </div>
</div>
</body>
</html>
