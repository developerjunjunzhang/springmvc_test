<%--
  Created by IntelliJ IDEA.
  User: 军君
  Date: 2020/7/31
  Time: 9:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<html>
<head>
    <title>Success</title>
</head>
<body>
    <h2>Success Jsp</h2>
    <br>
    ${requestScope.msg}
    <br>
    ${sessionScope}
    <br>
    ${user.name}
    ${user.age}
    ${user.date}
</body>
</html>
