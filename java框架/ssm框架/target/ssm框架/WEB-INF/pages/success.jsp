<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/11/5
  Time: 16:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>测试成功了啊</h3>
${requestScope.list}<br>

<c:forEach  items="${requestScope.list}" var="account" varStatus="s">
   ${s.index}+ ${account.name}+${account.money}<br>
</c:forEach>

</body>
</html>
