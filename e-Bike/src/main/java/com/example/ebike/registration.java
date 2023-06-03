package com.example.ebike;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet("/registration")
public class registration extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String uname = req.getParameter("user_name");
        String upass = req.getParameter("user_password");
        String uemail = req.getParameter("user_email");
        String uaddress = req.getParameter("user_address");
        String uphone = req.getParameter("user_phone");
        RequestDispatcher rd = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebike","root","oracle");
            PreparedStatement pst = con.prepareStatement("insert into user(name,password,email,address,phone) values(?,?,?,?,?)");
            pst.setString(1,uname);
            pst.setString(2,upass);
            pst.setString(3,uemail);
            pst.setString(4,uaddress);
            pst.setString(5,uphone);
           int rcount= pst.executeUpdate();
            rd = req.getRequestDispatcher("register.jsp");
            if(rcount >0){
                req.setAttribute("Status","success");
            }
            else{
                req.setAttribute("Status","failed");
            }
            rd.forward(req,resp);
            out.println("DONE");
            con.close();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
