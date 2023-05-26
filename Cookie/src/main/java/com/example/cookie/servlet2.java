package com.example.cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/servlet2")
public class servlet2 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

         Cookie[] cookies = req.getCookies();
         Boolean f = false;
        String name ="";
        if(cookies==null){
            out.println("<h1>u r new user go to register</h1>");
        }
        else{
            for(Cookie c : cookies){
                    String temp = c.getName();
                    if(temp.equals("user_name")){
                        f=true;
                        name=c.getValue();
                    }
            }
        }
        if(f) {
            out.println("<h1>welcome " + name + "</h1>");
            out.println("<a href='servlet1'>got to servlet one</a>");
        }
        else{
            out.println("<h1>u r new user go to register</h1>");
        }
    }
}
