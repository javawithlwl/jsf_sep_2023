package com.careerit.iplstats.service;

import com.careerit.iplstats.domain.PlayerDetails;
import com.careerit.iplstats.dto.CountryCountStats;
import com.careerit.iplstats.dto.RoleAmountDto;
import com.careerit.iplstats.dto.RoleCountDto;
import com.careerit.iplstats.dto.TeamAmountStatsDto;

import java.util.List;

public interface IplStatsService {
        List<TeamAmountStatsDto> getTeamAmountStats();
        List<RoleAmountDto> getRoleAmountStats();
        List<CountryCountStats> getCountryCountStats();
        List<String> getTeamNames();
        List<PlayerDetails> getPlayersOf(String teamName);
        RoleAmountDto getRoleAmountStats(String teamName);
        CountryCountStats getCountryCountStats(String teamName, String roleName);

}
