package com.careerit.cj.day21.iplstats;

public class IplStatsManager {

    public static void main(String[] args) {

        IplStatsService service = new IplStatsService();
        System.out.println(service.getTeamStats());

    }
}
