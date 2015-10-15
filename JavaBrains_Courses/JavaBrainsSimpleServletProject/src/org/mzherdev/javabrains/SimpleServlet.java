package org.mzherdev.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet(description = "A simple servlet", urlPatterns = { "/SimpleServletPath" },initParams=@WebInitParam(name="defaultUser", value="John Doe"))
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SimpleServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello from GET method.");
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.println("<h3>Hello in html</h3>");	
		
		String userName = request.getParameter("userName");
		HttpSession session = request.getSession();
		ServletContext context = request.getServletContext();
		if(userName != "" && userName != null) {
			session.setAttribute("savedUserName", userName);
			context.setAttribute("savedUserName", userName);
		}
		
//		out.println("Hello from GET method, " + userName + "!");
		writer.println("Request parameter has userName as " + userName);
		writer.println("<br>Session parameter has userName as " + session.getAttribute("savedUserName"));
		writer.println("<br>Context parameter has userName as " + context.getAttribute("savedUserName"));
		writer.println("<br>INIT parameter has default user as " + getServletConfig().getInitParameter("defaultUser"));
		}

}
