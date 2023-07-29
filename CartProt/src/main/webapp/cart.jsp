<%@ page import="Dao.ProductDao" %>
<%@ page import="com.example.modules.Product" %>
<%@ page import="com.example.modules.User" %>
<%@ page import="connection.Dbcon" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.example.modules.Cart" %>
<%@ page isELIgnored="false" %>
<%--
  Created by IntelliJ IDEA.
  User: nithin
  Date: 27/06/23
  Time: 11:13 am
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    User auth = (User) request.getSession().getAttribute("auth");
    if(auth!=null){
        request.setAttribute("auth",auth);
    }
    ArrayList<Cart> cart_list = (ArrayList<Cart>) session.getAttribute("cart-list");
    List<Cart> cartProduct = null;
    if(cart_list != null){
        ProductDao pDao = new ProductDao(Dbcon.getConnection());
        double total = pDao.getTotalCartPrice(cart_list);
        cartProduct = pDao.getCartProducts(cart_list);
        request.setAttribute("cart_list",cart_list);
        request.setAttribute("total",total);
    }
%>
<html>
<head>
    <title>Title</title>
    <%@include file = "includes/header.jsp" %>
</head>
<body>
<%@include file="includes/navbar.jsp"%>
        <div class="container">
            <div class="d-flex py-3">
                <h3>Total Price:$ ${total}</h3>
                <a class="mx-3 btn btn-primary" href="#">Check Out</a>
            </div>
                <table class="table table-light">
                    <thead>
                           <tr>
                               <th scope="col">Name</th>
                               <th scope="col">Category</th>
                               <th scope="col">Price</th>
                               <th scope="col">Buy now</th>
                               <th scope="col">Cancel</th>
                           </tr>
                    </thead>
                    <tbody>
                    <%
                        if(cart_list != null){
                            for(Cart c : cartProduct){ %>
                                        <tr>
                                <td><%= c.getName() %> </td>
                                <td><%= c.getCategory() %> </td>
                                <td>$<%= c.getPrice()%></td>
                                 <td>
                                     <form action="" method="post" class="form-inline">
                                         <input type="hidden" name="id" value="<%= c.getId() %>" class="form-input">
                                         <div class="form-group d-flex justify-content-between">
                                             <a class="btn btn-sm btn-decre" href=""><i class="fas fa-minus-square"></i></a>
                                             <input type="text" name="quantity" class="form-control" value="1" readonly>
                                             <a class="btn btn-sm btn-incre " href=""><i class="fas fa-plus-square"></i></a>
                                         </div>
                                     </form>
                                 </td>
                                <td>
                                    <a class="btn btn-sm btn-danger" href="">remove</a>
                                </td>
                            </tr>
                        <%    }
                        }
                    %>

                    </tbody>
                </table>

        </div>







<%@include file="includes/footer.jsp" %>
</body>
</html>
