package com.careerit.cj.day29;

import com.careerit.iplstats.domain.Player;
import com.careerit.iplstats.util.JsonPlayerReaderUtil;

import java.util.Comparator;
import java.util.List;

public class CollectionSortExample2 {

    public static void main(String[] args) {

        List<Player> players = JsonPlayerReaderUtil.loadPlayers();

        List<Player> sortedList = players.stream()
                .sorted(Comparator.comparing(Player::getAmount).reversed()
                .thenComparing(Player::getTeamName).reversed()
                        .thenComparing(Player::getName))
                .toList();

        sortedList.forEach(System.out::println);

    }

}
