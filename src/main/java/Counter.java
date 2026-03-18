import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Counter extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private int accesses = 0;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        accesses++;

        out.println("<html><body>");
        out.println("<h2>Number of times this servlet has been accessed: " + accesses + "</h2>");
        out.println("</body></html>");
    }
}