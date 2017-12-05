package pack;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
//this is edited
@WebServlet("/Gen")
public class GenRicServlet extends GenericServlet {

	@Override
	public void init(){
		System.out.println("init calling");
	}
	@Override
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("service calling");
		
	}
	@Override
	public void destroy(){
		System.out.println("destroy calling");
	}

}
