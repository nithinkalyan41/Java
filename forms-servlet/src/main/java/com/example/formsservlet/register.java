package com.example.formsservlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/register")
public class register extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();
        pw.println("<h1>welcome</h1>");
        String name = req.getParameter("user_name");
        String password = req.getParameter("user_password");
        String email = req.getParameter("user_email");
        String gender = req.getParameter("user_gender");
        String course = req.getParameter("user_course");
        String checkbox = req.getParameter("condition");
        if(checkbox!=null){
            pw.println("<h2 >Name:"+name+"</h2>");
            pw.println("<h2 >Password:"+password+"</h2>");
            pw.println("<h2 >E-mail:"+email+"</h2>");
            pw.println("<h2 >Gender:"+gender+"</h2>");
            pw.println("<h2 >Course:"+course+"</h2>");
            RequestDispatcher rd = req.getRequestDispatcher("sucess");
            //include
            rd.forward(req,resp);
        }
        else{
            pw.println("<h1>please make sure the checkbox checked</h1>");
            RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
            //include
            rd.include(req,resp);
        }

    }
}
