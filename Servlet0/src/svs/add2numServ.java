package svs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class add2numServ extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		if(req.getParameter("number1") != null && req.getParameter("number2") != null) {
			Long n1 = Long.parseLong( req.getParameter("number1") );
			Long n2 = Long.parseLong( req.getParameter("number2") );
			PrintWriter o = res.getWriter();
			o.println("The result is " + (n1 + n2));
		}
		
	}

}
