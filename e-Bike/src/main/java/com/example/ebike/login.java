package com.example.ebike;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.*;

@WebServlet("/login")

public class login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = (String) req.getParameter("user_name");
        String pass = (String) req.getParameter("user_password");
        ServletContext s = getServletContext();
        s.setAttribute("username",name);
        s.setAttribute("userpass",pass);
        System.out.println(name+" "+pass);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebike","root","oracle");
            String q = "select * from user where name='"+name+"' and password='"+pass+"'";
            PreparedStatement ps = con.prepareStatement(q);
           ResultSet row = ps.executeQuery();

           /* boolean is = false;
            while(row.next()){
                is =true;
            }
            if(is){
                rd.forward(req,resp);
            }
            else{
                rd.include(req,resp);
            }
            */
            if(row.next()) {
                RequestDispatcher rd = req.getRequestDispatcher("home.jsp");
               rd.forward(req,resp);
            }
            else{
                RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
                rd.forward(req,resp);
            }
            con.close();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
