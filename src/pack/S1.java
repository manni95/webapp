package pack;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class S1
 */

public class S1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("do get calling");
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		/*String ss[] = request.getParameterValues("ch");
		String k="";
		for(String s : ss){
			k=k+s+" ";
		}
		System.out.println(k);*/
		
		ServletContext context =getServletContext();
		
		response.getWriter().print(context.getInitParameter("jj"));
	}

}    
