package lab8;

/*
Q8(b): Build a servlet program to create a cookie to get your name 
through text box and press submit button (through HTML) to display 
the message by greeting "Welcome back your name ! , you have visited 
this page n times" along with the list of cookies and its set values 
and demonstrate the expiry of cookie also.
*/

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/CookieDetailServlet")

public class CookieDetailServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("username");
        int visitCount = 1;

        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("visitCount")) {
                    visitCount = Integer.parseInt(c.getValue());
                    visitCount++;
                }
            }
        }

        // Create cookies
        Cookie nameCookie = new Cookie("username", name);
        Cookie countCookie = new Cookie("visitCount", String.valueOf(visitCount));

        // Set expiry (60 sec)
        nameCookie.setMaxAge(60);
        countCookie.setMaxAge(60);

        response.addCookie(nameCookie);
        response.addCookie(countCookie);

        // Output
        out.println("<html><body>");
        out.println("<h2>Welcome back " + name + "!</h2>");
        out.println("<h3>You have visited this page " + visitCount + " times.</h3>");
        out.println("<p>(Cookie expires in 60 seconds)</p>");

        out.println("<h3>Cookie Details:</h3>");

        if (cookies != null) {
            for (Cookie c : cookies) {
                out.println("<p>");
                out.println("Name: " + c.getName() + "<br>");
                out.println("Value: " + c.getValue() + "<br>");
                out.println("Max Age: " + c.getMaxAge() + " sec<br>");
                out.println("</p><hr>");
            }
        }

        out.println("</body></html>");
    }
}
