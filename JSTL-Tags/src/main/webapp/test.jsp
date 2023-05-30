<%--
  Created by IntelliJ IDEA.
  User: nithin
  Date: 30/05/23
  Time: 1:29 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Test Page</title>
</head>
<body>
<h1><c:out value="${i}"></c:out></h1>
<c:remove var="i"></c:remove>
<h1><c:out value="${i}"></c:out></h1>
</body>
</html>
