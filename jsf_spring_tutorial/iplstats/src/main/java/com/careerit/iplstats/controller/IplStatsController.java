package com.careerit.iplstats.controller;


import com.careerit.iplstats.domain.PlayerDetails;
import com.careerit.iplstats.dto.TeamAmountStatsDto;
import com.careerit.iplstats.service.IplStatsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class IplStatsController {

    private final IplStatsService iplStatsService;

    @GetMapping("/teamnames")
    public ResponseEntity<List<String>> getTeamNames(){
        return ResponseEntity.ok(iplStatsService.getTeamNames());
    }
    @GetMapping("/teamamountstats")
    public ResponseEntity<List<TeamAmountStatsDto>> getTeamAmountStats(){
        return ResponseEntity.ok(iplStatsService.getTeamAmountStats());
    }

    @GetMapping("/players/{teamName}")
    public ResponseEntity<List<PlayerDetails>> getPlayersOfTeam(@PathVariable("teamName") String teamName){
        return ResponseEntity.ok(iplStatsService.getPlayersOf(teamName));
    }

}
