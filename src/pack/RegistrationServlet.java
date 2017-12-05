package pack;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegistrationServlet extends HttpServlet {

	public void doGet(HttpServletRequest request,HttpServletResponse response)
			throws IOException,ServletException{


// This is for new branch
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws IOException,ServletException{

		System.out.println("servlet calling");
		ServletConfig config = getServletConfig();
		String n = config.getInitParameter("n");
		response.getWriter().print(n);

		ServletContext context =getServletContext();

		response.getWriter().print(context.getInitParameter("jj"));

	}
}
