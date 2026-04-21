package lab10;

/*
Q10(b): Process student result and calculate average and pass/fail
*/

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ResultServlet")

public class ResultServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            int roll = Integer.parseInt(request.getParameter("roll"));
            String name = request.getParameter("name");

            int s1 = Integer.parseInt(request.getParameter("s1"));
            int s2 = Integer.parseInt(request.getParameter("s2"));
            int s3 = Integer.parseInt(request.getParameter("s3"));
            int s4 = Integer.parseInt(request.getParameter("s4"));
            int s5 = Integer.parseInt(request.getParameter("s5"));

            // Server-side validation
            if (name == null || name.isEmpty()) {
                throw new Exception("Invalid Input");
            }

            int total = s1 + s2 + s3 + s4 + s5;
            double avg = total / 5.0;

            String result = (s1 >= 40 && s2 >= 40 && s3 >= 40 && s4 >= 40 && s5 >= 40)
                    ? "PASS" : "FAIL";

            // Set attributes
            request.setAttribute("roll", roll);
            request.setAttribute("name", name);
            request.setAttribute("s1", s1);
            request.setAttribute("s2", s2);
            request.setAttribute("s3", s3);
            request.setAttribute("s4", s4);
            request.setAttribute("s5", s5);
            request.setAttribute("avg", avg);
            request.setAttribute("result", result);

            // Forward
            RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
            rd.forward(request, response);

        } catch (Exception e) {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<h2>Invalid Input!</h2>");
            out.println("<a href='index.jsp'>Go Back</a>");
        }
    }
}
