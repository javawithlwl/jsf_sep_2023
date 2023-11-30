package com.careerit.iplstats.repo;

import com.careerit.iplstats.domain.PlayerDetails;
import com.careerit.iplstats.dto.CountryCountStats;
import com.careerit.iplstats.dto.RoleAmountDto;
import com.careerit.iplstats.dto.TeamAmountStatsDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IplStatsRepo extends JpaRepository<PlayerDetails, Long> {

        @Query("select distinct p.teamName from PlayerDetails p")
        List<String> getTeamNames();

        @Query("select new com.careerit.iplstats.dto.TeamAmountStatsDto(p.teamName teamName,sum(p.amount) totalAmount) from PlayerDetails p group by p.teamName")
        List<TeamAmountStatsDto> findTeamAmountStats();

        List<PlayerDetails> findByTeamName(String teamName);

        @Query("select new com.careerit.iplstats.dto.RoleAmountDto(p.roleName roleName,sum(p.amount) totalAmount) from PlayerDetails p group by p.roleName")
        List<RoleAmountDto> findRoleAmountStats();

        @Query("select new com.careerit.iplstats.dto.RoleAmountDto(p.roleName roleName,sum(p.amount) totalAmount) from PlayerDetails p where p.teamName=:teamName group by p.roleName")
        List<RoleAmountDto> findRoleAmountOfTeam(@Param("teamName") String team);

        @Query("select new com.careerit.iplstats.dto.CountryCountStats(p.countryName countryName,count(p.countryName) count) from PlayerDetails p where p.teamName=:teamName and p.roleName=:roleName group by p.countryName")
        List<CountryCountStats> findCountryCountStats(@Param("teamName") String teamName,@Param("roleName") String roleName);

        @Query("select new com.careerit.iplstats.dto.CountryCountStats(p.countryName country,count(p.countryName) count) from PlayerDetails p group by p.countryName")
        List<CountryCountStats> findCountryCountStats();

        boolean existsByTeamName(String teamName);
}
