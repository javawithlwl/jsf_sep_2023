package com.careerit.cj.day26.iplstats;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;
import java.util.stream.Collectors;

public class IplStatsServiceImpl implements IplStatsService{

    private final List<Player> players;

    public IplStatsServiceImpl(){
        players = JsonReaderUtil.readJson("players.json", new TypeReference<>() {});
    }

    @Override
    public List<Player> getAllPlayers() {
        return players;
    }

    @Override
    public List<String> getTeamNames() {
        return null;
    }

    @Override
    public List<String> playersByTeam(String teamName) {
        return players.stream()
                .filter(p->p.getTeamName().equals(teamName))
                .map(Player::getName)
                .toList();
    }

    @Override
    public List<String> playersByRole(String role) {
        return null;
    }

    @Override
    public List<String> playersByTeamAndRole(String teamName, String role) {
        return null;
    }

    @Override
    public List<String> getRoleNames() {
        return null;
    }

    @Override
    public double getMaxAmount() {
        return 0;
    }

    @Override
    public double totalAmountByTeam(String teamName) {
        return 0;
    }
}
