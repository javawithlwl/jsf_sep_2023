package com.careerit.stats;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Servlet implementation class ViewPlayersServlet
 */
public class ViewPlayersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private PlayerService playerService = new PlayerService();
	
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	     List<Player> players = playerService.getPlayers();
	     request.setAttribute("players", players);
         RequestDispatcher rd = request.getRequestDispatcher("players.jsp");
	     rd.forward(request, response);
	     
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
