<%@ page import="com.example.modules.User" %>
<%@ page import="com.example.modules.Cart" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: nithin
  Date: 27/06/23
  Time: 11:12 am
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    User auth = (User) request.getSession().getAttribute("auth");
    if(auth!=null){
        request.setAttribute("auth",auth);
    }
    ArrayList<Cart> cart_list = (ArrayList<Cart>) session.getAttribute("cart-list");
    if(cart_list != null){
        request.setAttribute("cart_list",cart_list);
    }
%>
<html>
<head>
    <title>Shopping Cart login</title>
    <%@include file="includes/header.jsp" %>
</head>
<body>
<%@include file="includes/navbar.jsp"%>
        <div class="container">
                <div class="card w-50 mx-auto my-5 ">
                        <div class="card-header text-center">User Login</div>
                        <div class="card-body">
                            <form action="user-login" method="post">
                                    <div class="form-group">
                                        <label>Email Address</label>
                                        <input type="email" class="form-control" name="login-email" required placeholder="Enter Your mail">
                                    </div>
                                    <div class="form-group">
                                        <label>Password</label>
                                        <input type="password" class="form-control" name="login-password" required placeholder="******">
                                    </div>
                                    <div class="text-center">
                                             <button type="submit" class="btn btn-primary">Login</button>
                                    </div>

                            </form>
                        </div>


                </div>
        </div>


<%@include file="includes/footer.jsp" %>
</body>
</html>
