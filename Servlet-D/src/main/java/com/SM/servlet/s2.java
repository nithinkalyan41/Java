package com.SM.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class s2 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        int nn1 =Integer.parseInt(req.getParameter("n1"));
        int nn2 =Integer.parseInt(req.getParameter("n2"));
        int pro = nn1*nn2;
        int sum1 = (int) req.getAttribute("sum");
        out.println("<h1>");
        out.println("sum is = "+sum1+"product is ="+pro);
        out.println("</h1>");
        out.println("</body></html>");
        //out.close();
    }
}
