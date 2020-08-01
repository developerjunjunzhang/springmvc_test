<%--
  Created by IntelliJ IDEA.
  User: 军君
  Date: 2020/7/31
  Time: 13:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试参数绑定</title>
</head>
<body>
    <form action="params/saveAccount" method="post">
        姓名：<input type="text" name="username"><br/>
        密码：<input type="text" name="password"><br/>
        金额：<input type="text" name="money"><br/>
        户名：<input type="text" name="user.name"><br/>
        年龄：<input type="text" name="user.age"><br/>
        <input type="submit" value="提交">
    </form>
</body>
</html>
