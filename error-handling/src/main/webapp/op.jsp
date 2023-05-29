<%--
  Created by IntelliJ IDEA.
  User: nithin
  Date: 29/05/23
  Time: 3:01 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page errorPage="error_ex.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <%
            //fetch two numbers
            int n1 = Integer.parseInt(request.getParameter("n1"));
            int n2 = Integer.parseInt(request.getParameter("n2"));
            int ans = n1/n2;
        %>
        <h1>Result is: <%= ans%></h1>
</body>
</html>
