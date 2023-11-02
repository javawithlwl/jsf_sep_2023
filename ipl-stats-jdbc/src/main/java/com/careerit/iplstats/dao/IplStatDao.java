package com.careerit.iplstats.dao;

import com.careerit.iplstats.domain.Player;
import com.careerit.iplstats.dto.RoleStatsDto;
import com.careerit.iplstats.dto.TeamStatsDto;

import java.util.List;

public interface IplStatDao {

    List<String> selectTeamNames();
    List<String> selectRoles();
    List<Player> selectPlayersOfTeam(String teamName);
    List<TeamStatsDto> selectTeamStats();
    List<RoleStatsDto> selectRoleStats(String teamName);
    List<Player> selectTopPaidPlayersOfEachTeam();
}
