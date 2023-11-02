package com.careerit.iplstats.service;

import com.careerit.iplstats.domain.Player;
import com.careerit.iplstats.dto.RoleStatsDto;
import com.careerit.iplstats.dto.TeamStatsDto;

import java.util.List;

public interface IplStatService {

        List<String> getTeamNames();
        List<String> getRoles();
        List<Player> getPlayersOfTeam(String teamName);
        List<TeamStatsDto> getTeamStats();
        List<RoleStatsDto> getRoleStats(String teamName);
        List<Player> getTopPaidPlayersOfEachTeam();

}
