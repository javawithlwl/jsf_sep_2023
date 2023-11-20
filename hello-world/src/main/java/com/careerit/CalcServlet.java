package com.careerit;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class CalcServlet
 */

@WebServlet("/calc")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
			doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		System.out.println(num1+" "+num2);
		StringBuilder sb = new StringBuilder();
		sb.append("<html><head><title>Greetings</title></head>");
		sb.append("<body>");

		sb.append("<h3>Greetings from Web world</h3>");
		sb.append("<a href='index.jsp'>Home</a>");

		sb.append("<p>" + num1+" + "+num2+" = "+(num1+ num2)+"</p>");
		sb.append("<p>" + num1+" - "+num2+" = "+(num1 - num2)+"</p>");
		sb.append("<p>" + num1+" * "+num2+" = "+(num1 * num2)+"</p>");
		sb.append("<p>" + num1+" / "+num2+" = "+(num1 / num2)+"</p>");
		sb.append("<p>" + num1+" % "+num2+" = "+(num1 % num2)+"</p>");
		

		sb.append("</body>");
		sb.append("</html>");
		
		response.setContentType("text/html");
		response.getWriter().print(sb.toString());
	}

}
