package lab9;

/*
Q9(c): Check whether session is active or expired
*/

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/SessionCheckServlet")

public class SessionCheckServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession(false);

        out.println("<html><body>");

        if (session != null && session.getAttribute("user") != null) {
            out.println("<h2>Hello " + session.getAttribute("user") + "!</h2>");
            out.println("<p>Session is still active.</p>");
        } else {
            out.println("<h2>Session Expired!</h2>");
            out.println("<p>No active session found.</p>");
        }

        out.println("<br><a href='9c Index.jsp'>Go Back</a>");
        out.println("</body></html>");
    }
}
