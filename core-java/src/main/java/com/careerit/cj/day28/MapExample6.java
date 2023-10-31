package com.careerit.cj.day28;

import com.careerit.iplstats.domain.Player;
import com.careerit.iplstats.util.JsonPlayerReaderUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample6 {

    public static void main(String[] args) {

        List<Player> players = JsonPlayerReaderUtil.loadPlayers();
        System.out.println(players.size());
        // Get team wise player details

        Map<String, List<Player>> playerDetailsMap = new HashMap<>();

        // Get player details based on role

        Map<String, List<Player>> roleWisePlayerMap = new HashMap<>();

        // Get teamName and count of players in each team

        Map<String,Integer> teamNameCountMap = new HashMap<>();

        // Get team and role wise player details
        Map<String,Map<String,List<Player>>> teamRoleWisePlayerMap = new HashMap<>();
    }
}
