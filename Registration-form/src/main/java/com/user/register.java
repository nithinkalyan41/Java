package com.user;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static java.lang.Class.forName;

@WebServlet("/register")
@MultipartConfig
public class register extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String name = req.getParameter("user_name");
        String password = req.getParameter("user_password");
        String email = req.getParameter("user_email");
       /* out.println(" "+name+" "+password+" "+email+" ");*/
        /*Part part = req.getPart("image");
        String file = part.getSubmittedFileName();
        out.println(file);*/
        try {
            Thread.sleep(3000);
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/reg","root","oracle");
            String q = "insert into user(name,password,email) values(?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(q);
            pstmt.setString(1,name);
            pstmt.setString(2,password);
            pstmt.setString(3,email);
            //pstmt.setString(4,file);

            pstmt.executeUpdate();

            //upload
           /* InputStream is = part.getInputStream();
            byte[] data = new byte[is.available()];
            is.read(data);
            String path = req.getRealPath("/")+"image"+ File.separator+file;
            out.println(path);*/

            out.println("DONE");

            out.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
