package lab9;

/*
Q9(a): Build a Session Management using Servlet program set with one minute 
session to show Session Tracking Information, Session ID, Session Creation Time, 
Last Access Time, Visit Count
*/

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.util.Date;

@WebServlet("/SessionServlet")

public class SessionServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Get session
        HttpSession session = request.getSession();

        // Set session timeout (60 sec)
        session.setMaxInactiveInterval(60);

        // Visit count logic
        Integer visitCount = (Integer) session.getAttribute("visitCount");

        if (visitCount == null) {
            visitCount = 1;
        } else {
            visitCount++;
        }

        session.setAttribute("visitCount", visitCount);

        // Output
        out.println("<html><body>");
        out.println("<h2>Session Tracking Information</h2>");

        out.println("<p><b>Session ID:</b> " + session.getId() + "</p>");
        out.println("<p><b>Creation Time:</b> " + new Date(session.getCreationTime()) + "</p>");
        out.println("<p><b>Last Access Time:</b> " + new Date(session.getLastAccessedTime()) + "</p>");
        out.println("<p><b>Visit Count:</b> " + visitCount + "</p>");
        out.println("<p><b>Session Timeout:</b> 60 seconds</p>");

        out.println("</body></html>");
    }
}
