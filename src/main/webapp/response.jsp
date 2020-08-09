<%--
  Created by IntelliJ IDEA.
  User: 军君
  Date: 2020/8/6
  Time: 9:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ResponseTest</title>
    <script src="js/jquery.min.js"></script>
    <script>
        $(function () {
            $("#btn").click(function () {
                $.ajax({
                    url: "user/testAjax",
                    contentType: "application/json;charset=UTF-8",
                    data: '{"name":"hehe","age":34,"date":"2018-12-08"}',
                    dataType: "json",
                    type: "post",
                    success: function (data) {
                        // data是服务器端响应的数据
                        alert(data);
                        alert(data.name);
                    }
                })
            })
        })
    </script>
</head>
<body>
    <a href="user/testString">testString</a>
    <br>
    <a href="user/testVoid">testVoid</a>
    <br>
    <a href="user/testModelAndView">testModelAndView</a>
    <br>
    <a href="user/testForwardOrRedirect">testForwardOrRedirect</a>
    <br>
    <button id="btn">发送ajax请求</button>
</body>
</html>
