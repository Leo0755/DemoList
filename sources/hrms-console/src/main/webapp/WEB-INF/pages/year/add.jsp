<%--
  Created by IntelliJ IDEA.
  User: john
  Date: 2017/8/3
  Time: 21:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<body>
 <form action="${pageContext.request.contextPath}/year/add" method="post">
     工作年限：<input type="text" name="yname">
     <input type="submit" value="提交">
 </form>
</body>
</html>
