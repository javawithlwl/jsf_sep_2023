package com.careerit.iplstats.util;

import com.careerit.iplstats.domain.Player;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

public final class JsonPlayerReaderUtil {

    private JsonPlayerReaderUtil() {
    }

    public static List<Player> loadPlayers() {
        String fileName = "/players_data.json";
        ObjectMapper mapper = new ObjectMapper();
        List<Player> list = new ArrayList<>();
        try {
            list = mapper.readValue(JsonPlayerReaderUtil.class.getResourceAsStream(fileName), new TypeReference<>() {
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}



