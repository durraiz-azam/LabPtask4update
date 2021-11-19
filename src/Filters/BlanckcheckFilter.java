package Filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(filterName = "BlanckcheckFilter")
public class BlanckcheckFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();

        String fname = req.getParameter("fname");
        String lname = req.getParameter("lname");
        String phone = req.getParameter("phone");
        String email = req.getParameter("email");
        String address1 = req.getParameter("address1");
        if(fname == null || lname == null || phone == null || email == null || address1 == null)
        {
            out.print("filter is invoked before");
        }else {
            chain.doFilter(req, resp);
            out.print("Successgully saved");

        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
