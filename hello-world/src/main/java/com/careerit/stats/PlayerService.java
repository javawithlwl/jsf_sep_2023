package com.careerit.stats;

import java.util.List;

public class PlayerService {

	
		private PlayerDao playerDao;
		
		public PlayerService() {
			playerDao = new PlayerDao();
		}
		
		public List<Player> getPlayers(){
			return playerDao.selectPlayers();
		}
	
}
