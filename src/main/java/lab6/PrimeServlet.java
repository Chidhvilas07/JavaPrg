package lab6;

/*
Q6(c): Build a servlet program to check the given number is prime number 
or not using HTML with step by step procedure.
*/

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/PrimeServlet")

public class PrimeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        int n = Integer.parseInt(request.getParameter("num"));
        boolean isPrime = true;

        out.println("<html><body>");
        out.println("<h2>Prime Check Steps:</h2>");

        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= n / 2; i++) {

                out.println("Checking: " + n + " % " + i + "<br>");

                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime)
            out.println("<h3>" + n + " is a Prime Number</h3>");
        else
            out.println("<h3>" + n + " is NOT a Prime Number</h3>");

        out.println("</body></html>");
    }
}
