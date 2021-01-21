import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(
      name = "CorrectServlet",
      urlPatterns = "/correct"
)
public class CorrectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            String url = req.getRequestURI();
            req.setAttribute("url", url);
//        String correct = "you are correct";
//        req.setAttribute("correct", correct);
        req.getRequestDispatcher("/guessing-game/guess-result.jsp").forward(req, resp);
    }
}
