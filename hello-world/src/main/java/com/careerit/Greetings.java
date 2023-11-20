package com.careerit;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/greetings")
public class Greetings implements Servlet {

	@Override
	public void destroy() {
		System.out.print("Desroy method");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	public String getServletInfo() {
		return "Greeting servlet";
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.print("Init method");
		
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("Service");
		response.setContentType("text/html");
		StringBuilder sb = new StringBuilder();
		sb.append("<html><head><title>Greetings</title></head>");
		sb.append("<body>");
		sb.append("<h3>Greetings from Web world</h3>");
		sb.append("</body>");
		sb.append("</html>");
		PrintWriter out = response.getWriter();
		out.print(sb.toString());
		
		
	}

}
