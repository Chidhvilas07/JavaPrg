package lab7b;

/*
Q7(b): Cookie Management using Servlet (Add Cookie)
*/

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/AddCookieServlet")

public class AddCookieServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String domain = request.getParameter("domain");
        int age = Integer.parseInt(request.getParameter("age"));

        // Create cookie
        Cookie cookie = new Cookie(name, domain);
        cookie.setMaxAge(age);

        response.addCookie(cookie);

        out.println("<html><body>");
        out.println("<h2>Cookie Added Successfully!</h2>");
        out.println("<p>Name: " + name + "</p>");
        out.println("<p>Value: " + domain + "</p>");
        out.println("<p>Expiry: " + age + " seconds</p>");
        out.println("<br><a href='ViewCookieServlet'>View Cookies</a>");
        out.println("</body></html>");
    }
}
