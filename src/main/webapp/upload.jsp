<%--
  Created by IntelliJ IDEA.
  User: 军君
  Date: 2020/8/9
  Time: 15:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
    <h2>原生方式实现文件上传</h2>
    <form action="file/fileUploadOrigin" enctype="multipart/form-data" method="post">
        选中文件：<input type="file" name="upload" /><br>
        <input type="submit" value="提交" />
    </form>
    <br>
    <h2>SpringMvc实现文件上传</h2>
    <form action="file/fileUploadSpringMvc" enctype="multipart/form-data" method="post">
        选中文件：<input type="file" name="upload" /><br>
        <input type="submit" value="提交" />
    </form>
    <br>
    <h2>跨服务器文件上传</h2>
    <form action="file/fileUploadToServer" enctype="multipart/form-data" method="post">
        选中文件：<input type="file" name="upload" /><br>
        <input type="submit" value="提交" />
    </form>
</body>
</html>
