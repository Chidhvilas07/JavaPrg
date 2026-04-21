/*
Q6(a): Build a servlet program to find the factorial of a number 
using HTML with step by step procedure.
*/
package lab6;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

// Annotation replaces web.xml
@WebServlet("/FactorialServlet")

public class FactorialServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        int n = Integer.parseInt(request.getParameter("num"));
        int fact = 1;

        out.println("<html><body>");
        out.println("<h2>Factorial Calculation Steps:</h2>");

        // Step-by-step calculation
        for (int i = 1; i <= n; i++) {
            fact *= i;
            out.println("Step " + i + ": " + fact + "<br>");
        }

        out.println("<h3>Factorial of " + n + " is: " + fact + "</h3>");
        out.println("</body></html>");
    }
}