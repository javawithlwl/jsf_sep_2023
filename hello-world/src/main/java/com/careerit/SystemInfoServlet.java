package com.careerit;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/sysinfo")
public class SystemInfoServlet extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		System.out.println("Service");
		response.setContentType("text/html");
		Properties properties = System.getProperties();
		StringBuilder sb = new StringBuilder();
		sb.append("<html><head><title>Greetings</title></head>");
		sb.append("<body>");
		
		sb.append("<h3>Greetings from Web world</h3>");
		sb.append("<a href='index.jsp'>Home</a>");
		sb.append("<h5>System Properites</h5>");
		
		properties.entrySet().forEach(ele->{
			sb.append("<p>"+ele.getKey()+" => "+ele.getValue()+"</p>");
		});
		
		
		sb.append("</body>");
		sb.append("</html>");
		PrintWriter out = response.getWriter();
		out.print(sb.toString());
		
		
	}

}
