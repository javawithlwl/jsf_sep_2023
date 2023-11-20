package com.careerit.stats;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PlayerDao {
	
		
		public List<Player> selectPlayers(){
			
			Connection con = null;
			Statement st = null;
			ResultSet rs = null;
			List<Player> players = new ArrayList<>();
			try {
				con = ConnectionUtil.getInstance().getConnection();
				st = con.createStatement();
				rs = st.executeQuery("select id,name,role,team,country,amount from player");
				while(rs.next()) {
					Player player = getPlayerFromResultSet(rs);
					players.add(player);
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
			
			return players;
		}

		private Player getPlayerFromResultSet(ResultSet rs)throws SQLException {
			Player player = new Player();
			player.setId(rs.getLong("id"));
			player.setName(rs.getString("name"));
			player.setCountry(rs.getString("country"));
			player.setRole(rs.getString("role"));
			player.setAmount(rs.getDouble("amount"));
			player.setTeam(rs.getString("team"));
			return player;
		}

}
