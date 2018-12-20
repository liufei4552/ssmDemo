<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/12
  Time: 17:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <%=session.getId()%>
</head>
<body>
    <form action="user/login.do" method="post">
        用户名:<input type="text" name="account">
        密码:<input type="password" name="pass">
        <input type="submit" value="登录">
    </form>
</body>
</html>
