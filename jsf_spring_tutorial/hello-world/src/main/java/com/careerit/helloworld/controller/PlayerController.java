package com.careerit.helloworld.controller;

import com.careerit.helloworld.domain.Player;
import com.careerit.helloworld.service.PlayerService;
import com.careerit.helloworld.service.PlayerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {

        @Autowired
        private PlayerService playerService;
        @GetMapping("/all")
        public List<Player> getPlayers(){
            return playerService.getPlayers();
        }
}
