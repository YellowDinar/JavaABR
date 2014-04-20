import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Pattern;

/**
 * Created by ma on 04.04.14.
 */
public class RegFormServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        PrintWriter pw = response.getWriter();
        if(name.contains("-") || name.equals("")) {
            doGet(request,response);
            pw.println("Error!");
        }else {
            response.sendRedirect("/success");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        String name = request.getParameter("name");
        pw.println("<form action='/' method='POST'>");
        pw.println("<input type='text' name='name' value='"+
                (name==null?"":name)+
                "'/>");
        pw.println("<input type='submit' value='send'/>");
        pw.println("</form>");
    }
}
