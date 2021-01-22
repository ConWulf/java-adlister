import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
      name = "CorrectServlet",
      urlPatterns = "/correct"
)
public class CorrectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//            String url = req.getRequestURI();
//            req.setAttribute("url", url);
        String msg = "CORRECT";
        req.setAttribute("msg", msg);
        req.getRequestDispatcher("/guessing-game/guess-result.jsp").forward(req, resp);
    }
}
