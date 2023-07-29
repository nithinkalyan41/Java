package servlets;

import Dao.UserDao;
import com.example.modules.User;
import connection.Dbcon;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet("/user-login")
public class login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        try {
            String email = req.getParameter("login-email");
            String password = req.getParameter("login-password");
            UserDao udao = new UserDao(Dbcon.getConnection());
            User user = udao.userlogin(email,password);
            if(user!=null){
                out.println("user login-success");
                req.getSession().setAttribute("auth",user);
                resp.sendRedirect("index.jsp");
            }
            else{
                out.println("user login-failed");
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
