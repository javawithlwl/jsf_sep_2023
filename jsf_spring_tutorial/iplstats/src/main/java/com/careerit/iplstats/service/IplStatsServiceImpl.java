package com.careerit.iplstats.service;

import com.careerit.iplstats.domain.PlayerDetails;
import com.careerit.iplstats.dto.CountryCountStats;
import com.careerit.iplstats.dto.RoleAmountDto;
import com.careerit.iplstats.dto.TeamAmountStatsDto;
import com.careerit.iplstats.repo.IplStatsRepo;
import com.careerit.iplstats.service.exception.TeamNotFoundException;
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
        List<RoleAmountDto> roleAmountStats = iplStatsRepo.findRoleAmountStats();
        log.info("Total role size is {} ",roleAmountStats.size());
        return roleAmountStats;

    }

    @Override
    public List<CountryCountStats> getCountryCountStats() {
        List<CountryCountStats> countryCountStats = iplStatsRepo.findCountryCountStats();
        log.info("Total country size is {} ",countryCountStats.size());
        return countryCountStats;
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
        if(!iplStatsRepo.existsByTeamName(teamName)){
            log.info("Team with name {} not found",teamName);
            throw new TeamNotFoundException("Team with name "+teamName+" not found");
        }
        List<PlayerDetails> playerDetails = iplStatsRepo.findByTeamName(teamName);
        log.info("Total players found for team {} is {}",teamName,playerDetails.size());
        return playerDetails;
    }

    @Override
    public List<RoleAmountDto> getRoleAmountStats(String teamName) {
        Assert.notNull(teamName,"Team name should not be null");
        List<RoleAmountDto> roleAmountStats = iplStatsRepo.findRoleAmountOfTeam(teamName);
        log.info("Total role size is {} ",roleAmountStats.size());
        return roleAmountStats;
    }

    @Override
    public List<CountryCountStats> getCountryCountStats(String teamName, String roleName) {
        Assert.notNull(teamName,"Team name should not be null");
        Assert.notNull(roleName,"Role name should not be null");
        List<CountryCountStats> countryCountStats = iplStatsRepo.findCountryCountStats(teamName, roleName);
        log.info("With role {} and team {} has {} players",roleName,teamName,countryCountStats.size());
        return countryCountStats;
    }

    @Override
    public List<PlayerDetails> getAllPlayers() {
        List<PlayerDetails> playerDetails = iplStatsRepo.findAll();
        log.info("Total players found : {}",playerDetails.size());
        return playerDetails;
    }
}
