package com.example.first;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/nithin")
public class nithin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            PrintWriter out = resp.getWriter();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","oracle" );
            String n = req.getParameter("usrname");
            String p = req.getParameter("usrpwd");
            PreparedStatement pd = con.prepareStatement("select name from user where name=? and password=?");
            pd.setString(1,n);
            pd.setString(2,p);
            ResultSet rs =pd.executeQuery();
            if(rs.next()){

                RequestDispatcher rd = req.getRequestDispatcher("/welcome.jsp");
                rd.forward(req,resp);
            }
            else{
                out.println("<font color=red size=18>Login Failed!<br>");
                out.println("<a href=login.jsp>TRY AGAIN!!</a>");
                out.println("<a href=registration.jsp>register</a>");

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
