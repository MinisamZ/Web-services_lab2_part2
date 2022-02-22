import kz.iitu.Calculator;
import kz.iitu.CalculatorService;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.sql.ResultSet;

import static java.lang.Math.sqrt;


public class CalculatorPage extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        generateView(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        if (request.getParameter("first").isEmpty()) {
            generateView(request, response);
        } else {
            response.setContentType("text/html; charset=UTF-8");
            ResultSet resultSet = null;
            double a = Double.parseDouble(request.getParameter("first"));
            double b = Double.parseDouble(request.getParameter("second"));

            URL url = new URL("http://alex-strix-notebook:8080/JavaEE-WS-1.0-SNAPSHOT/CalculatorService");
            QName qname = new QName("http://iitu.kz/", "CalculatorService");
            Service service = Service.create(url, qname);
            CalculatorService calculatorService = new CalculatorService(url, qname);
            Calculator calculator = calculatorService.getCalculatorPort();

            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Result</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Result</h2>");
            switch (request.getParameter("sign")) {
                case "plus":
                    out.println("<h1>" + (calculator.additionOperator(a,b)) + "</h1>");
                    break;
                case "sub":
                    out.println("<h1>" + (calculator.subtractionOperator(a,b)) + "</h1>");
                    break;
                case "mul":
                    out.println("<h1>" + (calculator.multiplicationOperator(a,b)) + "</h1>");
                    break;
                case "div":
                    out.println("<h1>" + (calculator.divisionOperator(a,b)) + "</h1>");
                    break;
                case "sqrt":
                    out.println("<h1>" + (calculator.squareRoot(a)) + "</h1>");
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + request.getParameter("sing"));
            }
            out.println("</body>");
            out.println("</html>");
        }

    }

    public void generateView(HttpServletRequest request,
                             HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html; charset=UTF-8");
        ResultSet resultSet = null;
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Country</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<table cellpadding=\"4\">");
        out.println("<tr>\n" +
                "        <th>first num</th>\n" +
                "        <th>second num</th>\n" +
                "        <th>операция</th>\n" +
                "        <th>btn</th>\n" +
                "    </tr>");

        out.print("<tr>");
        out.print("<form>" + "<td><input placeholder=\"1\" name=\"first\">" + "</td>");
        out.print(" <td><input placeholder=\"2\" name=\"second\">" + "</td>");
        out.println("<td><select name=\"sign\">\n" +
                "    <option disabled>Выберите операцию</option>\n" +
                "    <option value='plus'>+</option>\n" +
                "    <option value=\"sub\">-</option>\n" +
                "    <option value=\"mul\">*</option>\n" +
                "    <option value=\"div\">/</option>\n" +
                "    <option value=\"sqrt\">sqrl</option>\n" +
                "   </select></td>");

        out.print(" <td><input type=\"submit\" value=\"Отправить\" formmethod=\"post\"> " + "</td></form>");
        out.print("</tr>");

        out.println("</table>");
        out.println("</body>");
        out.println("</html>");

    }
}