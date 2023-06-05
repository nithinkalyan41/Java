<%--
  Created by IntelliJ IDEA.
  User: nithin
  Date: 05/06/23
  Time: 11:43 am
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isErrorPage="true" %>
<html>
<head>
    <title>Sorry Something Went Wrong</title>
    <link rel="stylesheet" href="css/mystyle.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <style>
        .banner-background{
            clip-path: polygon(50% 0%, 100% 0, 100% 99%, 75% 93%, 39% 100%, 0 93%, 0 0);
        }
    </style>
</head>
<body>
<div class="container text-center">
    <img src="img/program-error.png" alt="" class="img-fluid">
    <h3 class="display-3">Sorry Something Went Wrong!!!</h3>
    <%= exception %>
    <a href="index.jsp" class="btn primary-background btn-lg text-white mt-3">Home</a>
</div>

</body>
</html>
