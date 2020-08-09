<%--
  Created by IntelliJ IDEA.
  User: 军君
  Date: 2020/8/3
  Time: 17:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>TestAnno</title>
</head>
<body>
    <a href="anno/testRequestParam?name=haha">啦啦啦</a>

    <form action="anno/testRequestBody" method="post">
        姓名：<input type="text" name="name"><br/>
        年龄：<input type="text" name="age"><br/>
        日期：<input type="text" name="date"><br/>
        <input type="submit" value="提交">
    </form>
    <br>

    <a href="anno/testPathVariable/12">testPathVariable</a>
    <br>

    <a href="anno/testRequestHeader">testRequestHeader</a>
    <br>

    <a href="anno/testCookieValue">testCookieValue</a>
    <br>

    <form action="anno/testModelAttribute1" method="post">
        姓名：<input type="text" name="name"><br/>
        年龄：<input type="text" name="age"><br/>
        <input type="submit" value="提交">
    </form>
    <br>

    <form action="anno/testModelAttribute2" method="post">
        姓名：<input type="text" name="name"><br/>
        年龄：<input type="text" name="age"><br/>
        <input type="submit" value="提交">
    </form>
    <br>

    <a href="anno/testSessionAttributes">testSessionAttributes</a>
    <br>
    <a href="anno/getSessionAttributes">getSessionAttributes</a>
    <br>
    <a href="anno/delSessionAttributes">delSessionAttributes</a>
    <br>

</body>
</html>
