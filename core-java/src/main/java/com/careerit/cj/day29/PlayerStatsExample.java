package com.careerit.cj.day29;

import com.careerit.iplstats.domain.Player;
import com.careerit.iplstats.util.JsonPlayerReaderUtil;
import org.apache.commons.lang3.tuple.Pair;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PlayerStatsExample {

    public static void main(String[] args) {
        List<Player> players = JsonPlayerReaderUtil.loadPlayers();
        System.out.println("Total players :" + players.size());
        Map<String, Long> teamNameAndCount = getTeamNameAndCount(players);
        System.out.println(teamNameAndCount);
        Pair<String, Long> pair = getPlayerCountPair(players, "RCB");
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());
        sort(players);
    }

    private static Map<String, Long> getTeamNameAndCount(List<Player> players) {
        return players.stream().collect(Collectors.groupingBy(Player::getTeamName, Collectors.counting()));
    }

    private static TeamCountDto getPlayerCount(List<Player> players, String teamName) {
        TeamCountDto teamCountDto = new TeamCountDto();
        teamCountDto.setTeamName(teamName);
        teamCountDto.setCount(players.stream().filter(p -> p.getTeamName().equals(teamName)).count());
        return teamCountDto;
    }

    private static Pair<String, Long> getPlayerCountPair(List<Player> players, String teamName) {
        return Pair.of(teamName, players.stream().filter(p -> p.getTeamName().equals(teamName)).count());
    }

    public static void sort(List<Player> players) {

        for (int i = 0; i < players.size() - 1; i++) {
            for (int j = 0; j < players.size() - i - 1; j++) {
                Player p1 = players.get(j);
                Player p2 = players.get(j + 1);
                if (p1.getAmount() < p2.getAmount()) {
                    players.set(j, p2);
                    players.set(j + 1, p1);
                }
            }

        }
        System.out.println(players);

    }
}
