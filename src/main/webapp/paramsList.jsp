<%--
  Created by IntelliJ IDEA.
  User: 军君
  Date: 2020/7/31
  Time: 14:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>集合数据绑定</title>
</head>
<body>
    <form action="params/testListMap" method="post">
        姓名：<input type="text" name="username"><br/>
        密码：<input type="text" name="password"><br/>
        金额：<input type="text" name="money"><br/>
        户名：<input type="text" name="users[0].name"><br/>
        年龄：<input type="text" name="users[0].age"><br/>
        户名：<input type="text" name="userMap['user'].name"><br/>
        年龄：<input type="text" name="userMap['user'].age"><br/>
        <input type="submit" value="提交">
    </form>
</body>
</html>
