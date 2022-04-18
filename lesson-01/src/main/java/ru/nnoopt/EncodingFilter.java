package ru.nnoopt;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns = "/*")
public class EncodingFilter implements Filter {

    private FilterConfig FilterConfig;

    @Override
    public void init(FilterConfig FilterConfig) throws ServletException {
        this.FilterConfig = FilterConfig;
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf-8");

        chain.doFilter(req, resp);
    }

    @Override
    public void destroy() {
    }
}
