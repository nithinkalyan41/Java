<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
    <c:out value="${' hello'}"></c:out>
    <%!
        int a = 50;
        int b = 10;
        public int sum(){
            return a+b;
        }
    %>
    <% out.println(a);
        out.println("<br>");
        out.println(b);
        out.println("<br>");
        out.println(sum());
    %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>