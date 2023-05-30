package filters;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import java.io.FileFilter;
import java.io.IOException;

public class TeacherAuthFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
                        HttpServletRequest req= (HttpServletRequest) servletRequest;
                        HttpSession session = req.getSession();
                        User user = (User) session.getAttribute("user");

    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
