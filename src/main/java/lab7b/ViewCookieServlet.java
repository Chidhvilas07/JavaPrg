package lab7b;

/*
Q7(b): Cookie Management using Servlet (View Cookies)
*/

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ViewCookieServlet")

public class ViewCookieServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        Cookie[] cookies = request.getCookies();

        out.println("<html><body>");
        out.println("<h2>Active Cookies</h2>");

        if (cookies != null) {
            for (Cookie c : cookies) {
                out.println("<p>");
                out.println("Name: " + c.getName() + "<br>");
                out.println("Value: " + c.getValue() + "<br>");
                out.println("Expiry: " + c.getMaxAge() + " sec");
                out.println("</p><hr>");
            }
        } else {
            out.println("<p>No cookies found.</p>");
        }

        out.println("<br><a href='7b Index.jsp'>Go Back</a>");
        out.println("</body></html>");
    }
}
