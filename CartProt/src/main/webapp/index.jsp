<%@ page import="com.example.modules.User" %>
<%@ page import="Dao.ProductDao" %>
<%@ page import="connection.Dbcon" %>
<%@ page import="com.example.modules.Product" %>
<%@ page import="java.util.List" %>
<%@ page import="static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.title" %>
<%@ page import="com.example.modules.Cart" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    User auth = (User) request.getSession().getAttribute("auth");
    if(auth!=null){
        request.setAttribute("auth",auth);
    }
    ProductDao  pd = new ProductDao(Dbcon.getConnection());
    List<Product> products = pd.getAllProducts();
    ArrayList<Cart> cart_list = (ArrayList<Cart>) session.getAttribute("cart-list");
    if(cart_list != null){
        request.setAttribute("cart_list",cart_list);
    }
%>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome to shopping cart!</title>
    <%@include file = "includes/header.jsp" %>
</head>
<body>
    <%@include file="includes/navbar.jsp"%>

    <div class="container">
        <div class="card-header my-3">All products</div>
            <div class="row">
                <%
                    if(!products.isEmpty()){
                        for(Product p : products){%>
                                     <div class="col-md-3">
                    <div class="card w-100" style="width: 18rem;">
                        <img class="card-img-top" src="product-image/<%= p.getImage()%>" alt="Card image cap">
                        <div class="card-body">
                            <h5 class="card-title"><%= p.getName()%></h5>
                            <h6 class="price">Price:$<%=p.getPrice()%></h6>
                            <h6 class="category">Category:<%=p.getCategory() %></h6>
                            <div class="mt-3 d-flex justify-content-between">
                            <a href="add-to-cart?id=<%=p.getId()%>" class="btn btn-primary">Add to Cart</a>
                            <a href="#" class="btn btn-primary">Buy now</a>
                            </div>
                        </div>
                    </div>
                </div>
               <%         }
                    }
                %>




            </div>
    </div>




<%@include file="includes/footer.jsp" %>
</body>
</html>