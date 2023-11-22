package com.careerit.helloworld.repo;

import com.careerit.helloworld.domain.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepo extends JpaRepository<Player, Long> {
}
