import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by ma on 28.03.14.
 */
public class HelloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String name = request.getParameter("whom");
        PrintWriter pw = response.getWriter();
        pw.println("<h1>Hello, " + name +
                "!</h1>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String name = request.getParameter("whom");
        PrintWriter pw = response.getWriter();
        pw.println("<h1>Hello, " + name +
                "!</h1>");
    }
}
