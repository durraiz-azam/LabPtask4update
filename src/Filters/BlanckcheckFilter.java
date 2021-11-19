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
        String address1 = req.getParameter("Address1");
        if(fname == null || lname == null || phone == null || email == null || address1 == null || fname.length()==0 || lname.length()==0 || phone.length()==0 || email.length()==0 || address1 .length()==0)
        {System.out.println(fname+lname+phone+email+address1);
            out.print("“none of the fields should be\n" +
                    "empty");
        }else {
            chain.doFilter(req, resp);
            out.print("Successgully saved");

        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
