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

//@WebServlet("/HelloWorld")
public class Add extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    Integer a=Integer.valueOf(req.getParameter("a"));
        Integer b=Integer.valueOf(req.getParameter("b"));
        PrintWriter out = resp.getWriter();
        out.println(a+b);
    }
}
