import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "GuessServlet",
        urlPatterns = "/guess"
)
public class GuessServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/guessing-game/guessing-game.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int randomNum = (int) Math.ceil(Math.random() * 3);
        int userNum = Integer.parseInt(req.getParameter("num"));
        if (userNum == randomNum) resp.sendRedirect("/correct");
        else resp.sendRedirect("/incorrect");

    }
}
