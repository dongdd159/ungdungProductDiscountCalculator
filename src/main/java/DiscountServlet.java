import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", value = "/display-discount")
public class DiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String des = request.getParameter("Des");
        double fprice = Float.parseFloat(request.getParameter("Price"));
        float dis = Float.parseFloat(request.getParameter("Dis"));
        double disamount = fprice*dis*0.01;
        double disprice = fprice - disamount;
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Product Description: " + des + "</h1>");
        writer.println("<h1>Product Price: " + fprice + "</h1>");
        writer.println("<h1>Discount Percent: " + dis + "%"+ "</h1>");
        writer.println("<h1>Discounted by up to: " + disamount + "</h1>");
        writer.println("<h1>Final Price: " + disprice + "</h1>");
        writer.println("</html>");
    }
}
