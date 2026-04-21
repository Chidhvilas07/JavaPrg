package lab10;

/*
Q10(a): Process user data with server-side validation
*/

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/UserDataServlet")

public class UserDataServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("username");
        String email = request.getParameter("email");
        String desig = request.getParameter("designation");

        // Server-side validation
        if (name == null || email == null || desig == null ||
            name.isEmpty() || email.isEmpty() || desig.isEmpty() ||
            !email.contains("@")) {

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<h2>Invalid Input! Please try again.</h2>");
            out.println("<a href='index.jsp'>Go Back</a>");
            return;
        }

        // Set attributes
        request.setAttribute("name", name);
        request.setAttribute("email", email);
        request.setAttribute("desig", desig);

        // Forward to result.jsp
        RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
        rd.forward(request, response);
    }
}
