<%--
  Created by IntelliJ IDEA.
  User: 6567
  Date: 2019/9/2
  Time: 16:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <form action="/aaa/updatetwo" method="post">
       <input type="hidden" name="id" value="${user.id}">
       <input type="text" name="name" value="${user.name}">
      <input type="submit" value="提交">

  </form>


</body>
</html>
