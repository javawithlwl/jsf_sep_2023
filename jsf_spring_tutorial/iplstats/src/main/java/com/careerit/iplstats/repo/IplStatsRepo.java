package com.careerit.iplstats.repo;

import com.careerit.iplstats.domain.PlayerDetails;
import com.careerit.iplstats.dto.TeamAmountStatsDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IplStatsRepo extends JpaRepository<PlayerDetails, Long> {

        @Query("select distinct p.teamName from PlayerDetails p")
        List<String> getTeamNames();

        @Query("select new com.careerit.iplstats.dto.TeamAmountStatsDto(p.teamName teamName,sum(p.amount) totalAmount) from PlayerDetails p group by p.teamName")
        List<TeamAmountStatsDto> findTeamAmountStats();

        List<PlayerDetails> findByTeamName(String teamName);
}
