package com.careerit.cj.day26.iplstats;

public class IplStatsManager {

    public static void main(String[] args) {

        IplStatsService service = new IplStatsServiceImpl();
        System.out.println(service.getAllPlayers().size());

        // Get all team names

    }
}
