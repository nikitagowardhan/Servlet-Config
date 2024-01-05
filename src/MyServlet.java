

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter p = response.getWriter();
		
		ServletConfig config = getServletConfig();
		String hr = config.getInitParameter("hr");
		
		p.print("If the configuration information is modified from the "
				+hr +" web.xml file, we don't need to change the servlet. "
				+ hr+" So it is easier to manage the web application if"
				+hr +" any specific content is modified from time to time.");
		
		
	}

	
	
	}


