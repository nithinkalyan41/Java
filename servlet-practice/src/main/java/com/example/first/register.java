package com.example.first;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet("/register")
public class register extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        try {
            PrintWriter pw = res.getWriter();
            Class.forName("com.mysql.jdbc.driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","oracle");
            String n = req.getParameter("usrname");
            String p = req.getParameter("usrpwd");
            PreparedStatement pd = conn.prepareStatement("insert into login values(?,?)");
            pd.setString(1,n);
            pd.setString(2,p);
            pd.executeQuery();
            pw.println("<a href=login.jsp>TRY AGAIN!!</a>");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
