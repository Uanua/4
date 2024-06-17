<%--
  Created by IntelliJ IDEA.
  User: 15098
  Date: 2024/6/4
  Time: 16:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/user/sayHello">第一springMvc的程序</a>
<form action="${pageContext.request.contextPath}/user/param1">
    name:<input type="text" name="username"><br/>
    age:<input type="text" name="age"><br/>
    <input type="submit" value="提交">
</form>
<form method="get" action="${pageContext.request.contextPath}/user/rest">
    name:<input type="text" name="restusername"><br/>
    age:<input type="text" name="restage"><br/>
    <input type="submit" value="提交">
</form>
</body>
</html>
