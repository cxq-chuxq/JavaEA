package club.banyuan;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.crypto.Data;

@WebServlet("/HelloWorld")
public class WebApp extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Date date=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
        PrintWriter out=resp.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("date");
        out.println("</body>");
        out.println("</html>");
    }
}
