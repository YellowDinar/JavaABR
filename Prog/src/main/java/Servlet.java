import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Dinar on 28.03.2014.
 */
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter print = response.getWriter();
        if (request.getParameter("oper") != null) {
            String oper = request.getParameter("oper");
            if (request.getParameter("arg1") != null) {
                String arg1 = request.getParameter("arg1");
                Double value1 = Double.parseDouble(arg1);
                Double result = null;
                if (request.getParameter("arg2") != null) {
                    String arg2 = request.getParameter("arg2");
                    Double value2 = Double.parseDouble(arg2);
                    if (value1 != null && value2 != null) {
                        switch (oper) {
                            case "add":
                                result = value1 + value2;
                                break;
                            case "sub":
                                result = value1 - value2;
                                break;
                            case "mult":
                                result = value1 * value2;
                                break;
                            case "div":
                                result = value1 / value2;
                                break;
                            default:
                                print.println("<h1 align='center'>Not found this operation</h1>");
                        }
                        print.println(result);
                    }else{
                        print.println("<h1 align='center'>Value of arguments not correct</h1>");
                    }
                }else{
                    if (value1 != null) {
                        switch (oper) {
                            case "sin":
                                result = Math.sin(value1);
                                break;
                            case "cos":
                                result = Math.cos(value1);
                                break;
                            case "ln":
                                result = Math.log(value1);
                                break;
                            case "exp":
                                result = Math.exp(value1);
                                break;
                            default:
                                print.println("<h1 align='center'>Not found this operation</h1>");
                        }
                        print.println(result);
                    }else{
                        print.println("<h1 align='center'>Value of argument not correct</h1>");
                    }
                }
            }else{
                print.println("<h1 align='center'>Input arg1 value!</h1>");
            }
        }else{
            print.println("<h1 align='center'>Input operation value!</h1>");
        }
        print.close();
    }
}