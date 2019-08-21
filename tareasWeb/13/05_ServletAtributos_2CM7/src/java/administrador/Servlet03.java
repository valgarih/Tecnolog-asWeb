package administrador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet03 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       response.setContentType("text/html;charset=UTF-8");
       
       HttpSession session = request.getSession();  /*Servirá para guardar: COFRE*/
       
       String valor1 = request.getParameter("clave01");
       session.setAttribute("clave01_atributo",valor1);
       
       PrintWriter out = response.getWriter();
       out.println("<!DOCTYPE html>");
       out.println("<html>");
       out.println("<head>");
       out.println("<title>Servlet03</title>");
       out.println("</head>");
       out.println("<body>");
       out.println("<h1> HELLO WORLD </h1>");
       out.println("</body>");
       out.println("</html>");
    }
}
