package org.mzherdev.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class XmlServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("XML servlet called");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		HttpSession session = request.getSession();
		ServletContext context = request.getServletContext();
		if(userName != "" && userName != null) {
			session.setAttribute("savedUserName", userName);
			context.setAttribute("savedUserName", userName);
		}
		
//		out.println("Hello from GET method, " + userName + "!");
		out.println("Request parameter has userName as " + userName);
		out.println("<br>Session parameter has userName as " + session.getAttribute("savedUserName"));
		out.println("<br>Context parameter has userName as " + context.getAttribute("savedUserName"));
		out.println("<br>INIT parameter has default user as " + getServletConfig().getInitParameter("defaultUser"));
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		String fullName = request.getParameter("fullName");
		
//		out.println("Hello, User!<br>");
		out.println("Hello from POST method, " + userName
				+ "<br>! We know your full name is " + fullName);
		String prof = request.getParameter("prof");
		out.println("<br>You are: " + prof);
		String location = request.getParameter("location");
		out.println("<br>Your location: " + location);
		
		String[] locations = request.getParameterValues("location");
		out.println("<br>Your location at: " + locations.length + " places");
		for(int i =0; i < locations.length; i++){
			out.println(locations[i]);
		}
	}

	
	
}
