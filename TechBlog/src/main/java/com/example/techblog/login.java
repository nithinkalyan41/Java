package com.example.techblog;

import com.techblog.dao.UserDao;
import com.techblog.entites.User;
import com.techblog.entites.message;
import com.techblog.helper.ConnectionProvider;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String userEmail = req.getParameter("email");
        String passWord = req.getParameter("password");
        UserDao dao = new UserDao(ConnectionProvider.getConnection());
        User user= dao.getUserByEmailAndPassword(userEmail,passWord);
        if(user==null){
            //login error
            //out.println("Invalid Details...... Try again");
            message msg = new message("Invalid Details","error","alert-danger");
            HttpSession session = req.getSession();
            session.setAttribute("msg",msg);
            resp.sendRedirect("login.jsp");
        }
        else{
            //login success
            HttpSession session = req.getSession();
            session.setAttribute("currentUser",user);
            resp.sendRedirect("profile.jsp");

        }
    }
}
