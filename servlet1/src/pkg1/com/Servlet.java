package pkg1.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/ServletURL")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Servlet() {
        super();
       System.out.println("i am in constractor");
    }

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("i am in init methode ");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter writer=response.getWriter();
		writer.print("i am in get methode!!!");
		String username=request.getParameter("uname");
		System.out.println(username);
	}

}
