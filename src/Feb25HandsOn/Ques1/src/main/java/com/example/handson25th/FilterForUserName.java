package com.example.handson25th;

import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebFilter("/page2.jsp")
public class FilterForUserName implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }
    public void destroy() {
    }
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        String s = request.getParameter("empId");
        System.out.println(s + " Hello World");
        if (s.length() > 5) {
            chain.doFilter(request, response);
        } else {
            response.getWriter().println("Too small");
        }
    }
}
