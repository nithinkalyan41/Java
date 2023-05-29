<%--
  Created by IntelliJ IDEA.
  User: nithin
  Date: 29/05/23
  Time: 4:41 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isErrorPage="true" %>
<html>
<head>
    <title>Page not found</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<div class="container p-3 text-center">
    <img src="img/5203299.jpg" class="img-fluid"  style="width:400px; height:400px; " alt="">
    <h1 class="display-3">Page not found!!!!!!!!!!</h1>
    <p><%= exception%></p>
    <button class="btn btn-outline-primary">HOME</button>
</div>

</body>
</html>
