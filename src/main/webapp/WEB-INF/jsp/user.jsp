<%--
  Created by IntelliJ IDEA.
  User: 6567
  Date: 2019/8/31
  Time: 14:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户</title>
</head>
<body>

  <table>
       <tr>
           <td>序号</td>
            <td>姓名</td>
       </tr>
      <c:forEach items="${lists}" var="user" >
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td><a href="/aaa/add">添加</a></td>
            <td><a href="/aaa/updateone?id=${user.id}">修改</a></td>
            <td><a href="/aaa/delete?id=${user.id}">删除</a></td>

        </tr>

      </c:forEach>


  </table>


</body>
</html>
