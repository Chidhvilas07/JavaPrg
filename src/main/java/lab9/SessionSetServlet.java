package lab9;

/*
Q9(c): Set session with custom expiry time and store username
*/

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/SessionSetServlet")

public class SessionSetServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("username");
        int time = Integer.parseInt(request.getParameter("time"));

        // Create session
        HttpSession session = request.getSession();

        // Set expiry time
        session.setMaxInactiveInterval(time);

        // Store user
        session.setAttribute("user", name);

        // Redirect to result page
        response.sendRedirect("9c Result.jsp");
    }
}
