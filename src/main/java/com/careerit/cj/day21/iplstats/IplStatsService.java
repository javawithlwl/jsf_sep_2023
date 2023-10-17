package com.careerit.cj.day21.iplstats;

import java.util.ArrayList;
import java.util.List;

public class IplStatsService {

    private List<Player> players;

    public IplStatsService() {
        JsonUtil jsonUtil = new JsonUtil();
        players = jsonUtil.loadPlayers();
    }

    public List<TeamStats> getTeamStats() {
        List<TeamStats> teamStatsList = new ArrayList<>();
        List<String> teamNames = getUniqueTeams();
        for (String team : teamNames) {
            double totalAmount = 0;
            for (Player player : players) {
                if (player.teamName().equals(team)) {
                    totalAmount += player.amount();
                }
            }
            TeamStats teamStats = new TeamStats(team, totalAmount);
            teamStatsList.add(teamStats);
        }
        return teamStatsList;
    }

    public List<RoleStats> getRoleStats() {
        return null;
    }

    public List<Player> topPaidPlayers(int n) {
        return null;
    }

    private List<String> getUniqueTeams() {
            /*List<String> teamNames = new ArrayList<>();
            for(Player player:players){
                if(!teamNames.contains(player.teamName())){
                    teamNames.add(player.teamName());
                }
            }
            return teamNames;*/
        return players.stream()
                .map(Player::teamName)
                .distinct()
                .toList();

    }

}
