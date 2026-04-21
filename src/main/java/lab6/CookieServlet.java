package lab6;

/*
Q6(b): Build a servlet program to create a cookie to get your name 
through text box and press submit button (through HTML) to display 
the message by greeting "Welcome back your name ! , you have visited 
this page n times" and demonstrate the expiry of cookie also.
*/

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/CookieServlet")

public class CookieServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("username");

        int visitCount = 1;

        // Get cookies from request
        Cookie cookies[] = request.getCookies();

        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("visitCount")) {
                    visitCount = Integer.parseInt(c.getValue());
                    visitCount++;
                }
            }
        }

        // Create/Update cookies
        Cookie nameCookie = new Cookie("username", name);
        Cookie countCookie = new Cookie("visitCount", String.valueOf(visitCount));

        // Set expiry time (60 seconds)
        nameCookie.setMaxAge(60);
        countCookie.setMaxAge(60);

        // Add cookies to response
        response.addCookie(nameCookie);
        response.addCookie(countCookie);

        // Display output
        out.println("<html><body>");
        out.println("<h2>Welcome back " + name + "!</h2>");
        out.println("<h3>You have visited this page " + visitCount + " times.</h3>");
        out.println("<p>(Cookie will expire in 60 seconds)</p>");
        out.println("</body></html>");
    }
}