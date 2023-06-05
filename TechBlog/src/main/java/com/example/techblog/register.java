package com.example.techblog;

import com.techblog.dao.UserDao;
import com.techblog.entites.User;
import com.techblog.helper.ConnectionProvider;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

import java.awt.desktop.PrintFilesEvent;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/registration")
@MultipartConfig
public class register extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String check = req.getParameter("check");
        if(check == null){
            out.println("please make sure the box checked");
        }
        else{
            String name = req.getParameter("user_name");
            String email = req.getParameter("user_email");
            String pass = req.getParameter("user_password");
            String gender = req.getParameter("gender");
            String about = req.getParameter("about");
            //create user object and pass that into the saveUserMethod
            User user = new User(name,email,pass,gender,about);

            //User Dao object
            UserDao dao = new UserDao(ConnectionProvider.getConnection());
            if(dao.saveUser(user)){
                out.println("done");
            }
            else{
                out.println("error");
            }

        }
    }
}
