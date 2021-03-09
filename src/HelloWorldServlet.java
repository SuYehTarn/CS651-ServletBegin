import java.io.*;
import javax.servlet.*;
public class HelloWorldServlet extends GenericServlet {

    public void service(ServletRequest req, ServletResponse res)
        throws ServletException, IOException{
        PrintStream out = new PrintStream(res.getOutputStream());
        out.println("Hello world!");
    }

    public String getServletInfo() {
        return "Hello World Servlet";
    }
} 