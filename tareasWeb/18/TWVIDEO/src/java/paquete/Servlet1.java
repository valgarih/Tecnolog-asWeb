
package paquete;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet1 extends HttpServlet {

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String nombre= request.getParameter("video");
        PrintWriter out = response.getWriter();
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet1</title>");            
            out.println("</head>");
            out.println("<body>");
            
            out.println("<video controls>");
            out.println("<source src='"+nombre+"' type='video/mp4'>");
            out.println("TU NAVEGADOR WEB NO SOPORTA VIDEO");
            out.println("</video>");
            
            out.println("</body>");
            out.println("</html>");
        
    }

}
