package com.example.cookie;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/servlet1")
public class servlet1 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String name = req.getParameter("name");
        PrintWriter out = resp.getWriter();
        //Cookie c = new Cookie("user_name",name);
        //0resp.addCookie(c);
        req.setAttribute("name",name);
        RequestDispatcher rd = req.getRequestDispatcher("servlet2");
        rd.forward(req,resp);
        out.println("<h1>hello "+name+"</h1>");
        out.println("<a href='servlet2'>go to servlet 2</a>");
    }
}
