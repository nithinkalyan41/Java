package servlets;

import com.example.modules.Cart;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
@WebServlet("/add-to-cart")
public class AddToCart extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        try(PrintWriter out = resp.getWriter()) {out.println("<h3 style='color:crimson;text-aligin:center'>Item already Exists<a href='cart.jsp'>Go to Cart Page</a></h3>");
            ArrayList<Cart> cartlist = new ArrayList<>();
            int id = Integer.parseInt(req.getParameter("id"));
            Cart cm = new Cart();
            cm.setId(id);
            cm.setQuantity(1);
            HttpSession session = req.getSession();
            ArrayList<Cart> cart_list = (ArrayList<Cart>) session.getAttribute("cart-list");
            if (cart_list == null) {
                cartlist.add(cm);
                session.setAttribute("cart-list", cartlist);
                resp.sendRedirect("index.jsp");
            } else {
                cartlist = cart_list;
                boolean exists = false;
                for (Cart c : cart_list) {
                    if (c.getId() == id) {out.println("<h3 style='color:crimson;text-aligin:center'>Item already Exists<a href='cart.jsp'>Go to Cart Page</a></h3>");
                        exists = true;
                        out.println("<h3 style='color:crimson;text-aligin:center'>Item already Exists<a href='cart.jsp'>Go to Cart Page</a></h3>");
                    }
                }
                if (!exists) {
                    cartlist.add(cm);
                    resp.sendRedirect("index.jsp");
                }
            }
        }
    }
}
