<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: nithin
  Date: 27/05/23
  Time: 11:45 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="java.util.Random" %>
<c:set var="name" value="nithin"> </c:set>
<c:out value="$(name)"> </c:out>
<%--<%@page isErrorPage="true" %>
<%@page session="false" %>
<%@page extends="" %>--%>

<html>
<head>
  <title>Title</title>
</head>
<body>
<h1>FIRST</h1>
<%!
  int a = 10;
  int b = 20;
  String name = "nithin";

  public int sum(){
    return a+b;
  }
  public String reverse(){
    StringBuffer br = new StringBuffer(name);
    return br.reverse().toString();
  }
%>
<h1>hello</h1>
<%--    <%--%>
<%--        out.println(a);--%>
<%--        out.println(b);--%>
<%--    --%>
<%--    %>--%>
<h1>sum is : <%= sum()%></h1>
<h1>Random number:
  <%
    Random r = new Random();
    int n = r.nextInt(10);
  %>
  <%= n
  %>
</h1>


</body>
</html>
