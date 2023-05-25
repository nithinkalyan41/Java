package com.SM.servlet;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class s1 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        String n = req.getParameter("n1");
        String nk = req.getParameter("n2");
        int nn1 = Integer.parseInt(n);
        int nn2 = Integer.parseInt(nk);
        int sum = nn1+nn2;
        req.setAttribute("sum",sum);
        RequestDispatcher rd = req.getRequestDispatcher("s2");
        rd.forward(req,resp);
        out.println("</body></html>");


       // out.close();
        // Hello

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return super.getServletInfo();
    }
}
