package com.careerit.helloworld.service;

import com.careerit.helloworld.domain.Player;
import com.careerit.helloworld.repo.PlayerRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerRepo playerRepo;
    @Override
    public List<Player> getPlayers() {
        List<Player> players = playerRepo.findAll();
        log.info("Total players found : {}",players.size());
        return players;
    }
}
