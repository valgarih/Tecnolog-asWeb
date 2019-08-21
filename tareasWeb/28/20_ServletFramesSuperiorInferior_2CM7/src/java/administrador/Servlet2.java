package administrador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet2 extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
	HttpSession sesion = request.getSession();
	String numero = (String) sesion.getAttribute("numero");
	String parametros = "?";
	for (int i = 0; i < Integer.parseInt(numero); i++) {
	    parametros += "href" + i + "=" + request.getParameter("href" + i) + "&" + 
			  "texto" + i + "=" + request.getParameter("texto" + i) + "&"; 
	}
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet</title>");
        out.println("</head>");
        out.println("<frameset rows=\"80,*,80\" framespacing=\"0\">");
        out.println("<frame src='Servlet3" + parametros + "'/>");
        out.println("<frame src='Servlet4' name='contenidos'/>");
	out.println("<frame src='Servlet5'/>");
        out.println("</frameset>");
        out.println("<body>");
	out.println("</body>");
        out.println("</html>");
    }

}