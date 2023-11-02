package com.careerit;

import com.careerit.iplstats.domain.Player;
import com.careerit.iplstats.service.IplStatService;
import com.careerit.iplstats.service.IplStatServiceImpl;

import java.util.List;

public class IplStatsManager {
    public static void main(String[] args) {

        IplStatService obj = new IplStatServiceImpl();
        // Get players of team -> CSK
        String teamName = "CSK";
        List<Player> cskPlayers = obj.getPlayersOfTeam(teamName);
        System.out.println(teamName+" has "+cskPlayers.size()+" players");

    }
}