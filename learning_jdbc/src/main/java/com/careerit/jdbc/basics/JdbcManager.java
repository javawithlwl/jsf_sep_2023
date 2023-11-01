package com.careerit.jdbc.basics;

import com.careerit.jdbc.domain.Player;
import com.careerit.jdbc.dto.TeamStatsDto;
import com.careerit.jdbc.util.ConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcManager {

    public static void main(String[] args) {
        List<Player> players = getPlayers();
        System.out.println(players.size());
        // Max paid players
        List<Player> maxPaidPlayers = getMaxPaidPlayers();
        maxPaidPlayers.forEach(System.out::println);

        // Team stats
        TeamStatsDto teamStatsDto = getTeamStats("RCB");
        System.out.println(teamStatsDto);

        // Players by team,role,country
        List<Player> playersByTeamRoleCountry = getPlayers("RCB", "Batsman", "India");
        playersByTeamRoleCountry.forEach(System.out::println);
    }

    public static List<Player> getMaxPaidPlayers(){
        String sql = "select id,name,role,country,team,amount from player where amount=(select max(amount) from player)";
        List<Player> players = new ArrayList<>();
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            con = ConnectionUtil.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                long id = rs.getLong("id");
                String name = rs.getString("name");
                String role = rs.getString("role");
                double amount = rs.getDouble("amount");
                String country = rs.getString("country");
                String team = rs.getString("team");
                Player player = Player.builder()
                        .id(id)
                        .name(name)
                        .role(role)
                        .amount(amount)
                        .country(country)
                        .team(team)
                        .build();
                players.add(player);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
           ConnectionUtil.close(rs,st,con);
        }
        return players;
    }

    public static List<Player> getPlayers() {
        String sql = "select id,name,role,amount,country,team from player";
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        List<Player> players = new ArrayList<>();
        try {
            con = ConnectionUtil.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                long id = rs.getLong("id");
                String name = rs.getString("name");
                String role = rs.getString("role");
                double amount = rs.getDouble("amount");
                String country = rs.getString("country");
                String team = rs.getString("team");
                Player player = Player.builder()
                        .id(id)
                        .name(name)
                        .role(role)
                        .amount(amount)
                        .country(country)
                        .team(team)
                        .build();
                players.add(player);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
           ConnectionUtil.close(rs,st,con);
        }
        return players;

    }

    public static TeamStatsDto getTeamStats(String teamName){
        String sql = "select team,count(*) as count,sum(amount) as total,max(amount) as max,min(amount) as min,avg(amount) as avg from player where team=? group by team;";
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        TeamStatsDto teamStatsDto = null;
        try {
            con = ConnectionUtil.getConnection();
            st = con.prepareStatement(sql);
            st.setString(1,teamName);
            rs = st.executeQuery();
            while (rs.next()) {
                String team = rs.getString("team");
                int count = rs.getInt("count");
                double total = rs.getDouble("total");
                double max = rs.getDouble("max");
                double min = rs.getDouble("min");
                double avg = rs.getDouble("avg");
                teamStatsDto = TeamStatsDto.builder()
                        .teamName(team)
                        .playersCount(count)
                        .totalAmount(total)
                        .maxAmount(max)
                        .minAmount(min)
                        .avgAmount(avg)
                        .build();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            ConnectionUtil.close(rs,st,con);
        }
        return teamStatsDto;


    }

    public static List<Player> getPlayers(String teamName,String roleName,String countryName) {
        String sql = "select * from player where team=? and role=? and country=?;";
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        List<Player> players = new ArrayList<>();
        try {
            con = ConnectionUtil.getConnection();
            st = con.prepareStatement(sql);
            st.setString(1,teamName);
            st.setString(2,roleName);
            st.setString(3,countryName);
            rs = st.executeQuery();
            while (rs.next()) {
                long id = rs.getLong("id");
                String name = rs.getString("name");
                String role = rs.getString("role");
                double amount = rs.getDouble("amount");
                String country = rs.getString("country");
                String team = rs.getString("team");
                Player player = Player.builder()
                        .id(id)
                        .name(name)
                        .role(role)
                        .amount(amount)
                        .country(country)
                        .team(team)
                        .build();
                players.add(player);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            ConnectionUtil.close(rs,st,con);
        }
        return players;

    }
}
