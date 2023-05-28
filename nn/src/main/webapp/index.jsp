<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
    <%--<c:set var = "salary" scope = "session" value = "${2000*2}"/>
    <c:out value="${salary}" />--%>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>

</body>
</html>