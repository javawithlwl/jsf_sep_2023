package com.careerit.jdbc.basics;

import com.careerit.jdbc.domain.Player;
import com.careerit.jdbc.dto.TeamStatsDto;
import com.careerit.jdbc.util.ConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

record Student(String name, int age) {
}

public class JdbcManager {

    public static void main(String[] args) {
       /* List<Player> players = getPlayers();
        System.out.println(players.size());
        // Max paid players
        List<Player> maxPaidPlayers = getMaxPaidPlayers();
        maxPaidPlayers.forEach(System.out::println);

        // Team stats
        TeamStatsDto teamStatsDto = getTeamStats("RCB");
        System.out.println(teamStatsDto);

        // Players by team,role,country
        List<Player> playersByTeamRoleCountry = getPlayers("RCB", "Batsman", "India");
        playersByTeamRoleCountry.forEach(System.out::println);*/
        /* createTable();*/
        /* insertData();*/
        /* alterTable();*/
        /*addMultipleRecords();*/
       /* updateAge();*/

        List<Student> students = getStudentDetails();
        System.out.println(students.size());

    }

    private static List<Student> getStudentDetails(){
        String sql = "select name,age from sample_1;";
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        List<Student> students = new ArrayList<>();
        ConnectionUtil util = ConnectionUtil.getInstance();
        try {
            con = util.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                String name = rs.getString("name");
                int age = rs.getInt("age");
                Student student = new Student(name, age);
                students.add(student);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            util.close(rs,st,con);
        }
        return students;
    }

    private static void updateAge(){
        String sql = "update sample_1 set age = age + 1 where age > 20";
        Connection con = null;
        Statement st = null;
        ConnectionUtil util = ConnectionUtil.getInstance();
        try {
            con = util.getConnection();
            st = con.createStatement();
            int count = st.executeUpdate(sql);
            System.out.println(count + " record(s) updated successfully ");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            util.close(st, con);
        }
    }

    private static void addMultipleRecords() {
        List<Student> students = List.of(new Student("Krish", 21),
                new Student("Rakesh", 22),
                new Student("Charan", 23));

        String sql = "insert into sample_1(name,age) values(?,?);";
        Connection con = null;
        PreparedStatement pst = null;
        ConnectionUtil util = ConnectionUtil.getInstance();
        try {
            con = util.getConnection();
            pst = con.prepareStatement(sql);
            for (Student student : students) {
                pst.setString(1, student.name());
                pst.setInt(2, student.age());
                pst.addBatch();
            }
            int[] arr = pst.executeBatch();
            System.out.println("Total records inserted :" + arr.length);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Player> getMaxPaidPlayers() {
        String sql = "select id,name,role,country,team,amount from player where amount=(select max(amount) from player);";
        List<Player> players = new ArrayList<>();
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        ConnectionUtil util = ConnectionUtil.getInstance();
        try {
            con = util.getConnection();
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
        } finally {
            util.close(rs, st, con);
        }
        return players;
    }

    public static List<Player> getPlayers() {
        String sql = "select id,name,role,amount,country,team from player;";
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        List<Player> players = new ArrayList<>();
        ConnectionUtil util = ConnectionUtil.getInstance();
        try {
            con = util.getConnection();
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
        } finally {
            util.close(rs, st, con);
        }
        return players;

    }

    public static TeamStatsDto getTeamStats(String teamName) {
        String sql = "select team,count(*) as count,sum(amount) as total,max(amount) as max,min(amount) as min,avg(amount) as avg from player where team=? group by team;";
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        TeamStatsDto teamStatsDto = null;
        ConnectionUtil util = ConnectionUtil.getInstance();
        try {
            con = util.getConnection();
            st = con.prepareStatement(sql);
            st.setString(1, teamName);
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
        } finally {
            util.close(rs, st, con);
        }
        return teamStatsDto;


    }

    public static List<Player> getPlayers(String teamName, String roleName, String countryName) {
        String sql = "select * from player where team=? and role=? and country=?;";
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        List<Player> players = new ArrayList<>();
        ConnectionUtil util = ConnectionUtil.getInstance();
        try {
            con = util.getConnection();
            st = con.prepareStatement(sql);
            st.setString(1, teamName);
            st.setString(2, roleName);
            st.setString(3, countryName);
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
        } finally {
            util.close(rs, st, con);
        }
        return players;

    }

    private static void createTable() {
        String sql = "create table sample_1(id serial,name varchar(50));";
        Connection con = null;
        Statement st = null;
        ConnectionUtil util = ConnectionUtil.getInstance();
        try {
            con = util.getConnection();
            st = con.createStatement();
            st.execute(sql);
            System.out.println("Table created successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            util.close(st, con);
        }
    }


    private static void insertData() {
        String sql = "insert into sample_1(name) values(?);";
        Connection con = null;
        PreparedStatement st = null;
        ConnectionUtil util = ConnectionUtil.getInstance();
        try {
            con = util.getConnection();
            st = con.prepareStatement(sql);
            st.setString(1, "Krish");
            int count = st.executeUpdate();
            System.out.println(count + " record(s) inserted successfully ");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            util.close(st, con);
        }
    }

    private static void alterTable() {
        String sql = "alter table sample_1 add column age int default 20;";
        Connection con = null;
        Statement st = null;
        ConnectionUtil util = ConnectionUtil.getInstance();
        try {
            con = util.getConnection();
            st = con.createStatement();
            st.execute(sql);
            System.out.println("Altered table successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            util.close(st, con);
        }
    }

}

// execute       => void          ddl (create,alter,drop,truncate)
// executeUpdate => int           dml (insert,update,delete)
// executeQuery  => ResultSet     select
