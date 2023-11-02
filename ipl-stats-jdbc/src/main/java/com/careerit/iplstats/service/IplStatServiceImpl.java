package com.careerit.iplstats.service;

import com.careerit.iplstats.dao.IplStatDao;
import com.careerit.iplstats.dao.IplStatDaoImpl;
import com.careerit.iplstats.domain.Player;
import com.careerit.iplstats.dto.RoleStatsDto;
import com.careerit.iplstats.dto.TeamStatsDto;

import java.util.List;

public class IplStatServiceImpl implements  IplStatService{

    private IplStatDao iplStatDao;


    public IplStatServiceImpl(){
        iplStatDao = new IplStatDaoImpl();
    }
    @Override
    public List<String> getTeamNames() {
        return null;
    }

    @Override
    public List<String> getRoles() {
        return null;
    }

    @Override
    public List<Player> getPlayersOfTeam(String teamName) {
        assert teamName != null : "Team name can't be null";
        return iplStatDao.selectPlayersOfTeam(teamName);
    }

    @Override
    public List<TeamStatsDto> getTeamStats() {
        return null;
    }

    @Override
    public List<RoleStatsDto> getRoleStats(String teamName) {
        return null;
    }

    @Override
    public List<Player> getTopPaidPlayersOfEachTeam() {
        return null;
    }
}
