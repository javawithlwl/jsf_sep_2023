package com.careerit.iplstats.service;

import com.careerit.iplstats.domain.PlayerDetails;
import com.careerit.iplstats.dto.CountryCountStats;
import com.careerit.iplstats.dto.RoleAmountDto;
import com.careerit.iplstats.dto.TeamAmountStatsDto;
import com.careerit.iplstats.repo.IplStatsRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class IplStatsServiceImpl implements IplStatsService{

    private final IplStatsRepo iplStatsRepo;
    @Override
    public List<TeamAmountStatsDto> getTeamAmountStats() {
        List<TeamAmountStatsDto> teamAmountStats = iplStatsRepo.findTeamAmountStats();
        log.info("Total team size is {} ",teamAmountStats.size());
        return teamAmountStats;
    }

    @Override
    public List<RoleAmountDto> getRoleAmountStats() {
        return null;
    }

    @Override
    public List<CountryCountStats> getCountryCountStats() {
        return null;
    }

    @Override
    public List<String> getTeamNames() {
        List<String> teamNames = iplStatsRepo.getTeamNames();
        log.info("Total teams found : {}",teamNames.size());
        return teamNames;
    }

    @Override
    public List<PlayerDetails> getPlayersOf(String teamName) {
        Assert.notNull(teamName,"Team name should not be null");
        List<PlayerDetails> playerDetails = iplStatsRepo.findByTeamName(teamName);
        log.info("Total players found for team {} is {}",teamName,playerDetails.size());
        return playerDetails;
    }

    @Override
    public RoleAmountDto getRoleAmountStats(String teamName) {
        return null;
    }

    @Override
    public CountryCountStats getCountryCountStats(String teamName, String roleName) {
        return null;
    }
}
