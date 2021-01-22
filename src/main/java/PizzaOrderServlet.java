import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet(
        name ="PizzaOrderServlet",
        urlPatterns = "/pizza-order"
)
public class PizzaOrderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/pizza-order/pizza-order-form.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sauce = req.getParameter("sauce");
        String size = req.getParameter("size");
        String crust = req.getParameter("crust");
        String address = req.getParameter("address");
        List<String> toppings;
        if (req.getParameterValues("toppings") != null)
             toppings = Arrays.asList(req.getParameterValues("toppings"));
        else toppings = Arrays.asList("none selected");

        List<String> pizza = new ArrayList<>(Arrays.asList(sauce, size, crust));


        req.setAttribute("pizza", pizza);
        req.setAttribute("address", address);
        req.setAttribute("toppings", toppings);

        if (address.length() != 0)
            req.getRequestDispatcher("/pizza-order/pizza-order-form.jsp").forward(req, resp);
        else resp.sendRedirect("/pizza-order");
    }
}
