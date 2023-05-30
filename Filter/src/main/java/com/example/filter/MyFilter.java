package com.example.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;
@WebFilter({"/ProfileServlet", "/OrderServlet"})

public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("BEFORE FILTER");
        //.........
        filterChain.doFilter(servletRequest,servletResponse);
        //.........
        System.out.println("AFTER FILTER");
    }

    @Override
    public void destroy() {

    }
}
