<%@ page import="com.techblog.entites.User" %><%--
  Created by IntelliJ IDEA.
  User: nithin
  Date: 05/06/23
  Time: 4:44 pm
  To change this template use File | Settings | File Templates.
--%>
<%@page errorPage="errorpage.jsp" %>
<%
  User user = (User)session.getAttribute("currentUser");
  if(user==null){
    response.sendRedirect("login.jsp");
  }
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Profile</title>
</head>
<body>
    <%= user.getName() %>
    <br>
    <%= user.getEmail() %>
    <br>
    <%= user.getAbout()%>

</body>
</html>
