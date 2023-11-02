package com.careerit.iplstats.dao;

import com.careerit.iplstats.domain.Player;
import com.careerit.iplstats.dto.RoleStatsDto;
import com.careerit.iplstats.dto.TeamStatsDto;
import com.careerit.iplstats.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class IplStatDaoImpl implements IplStatDao {

    @Override
    public List<String> selectTeamNames() {
        return null;
    }

    @Override
    public List<String> selectRoles() {
        return null;
    }

    @Override
    public List<Player> selectPlayersOfTeam(String teamName) {
        String sql = "select id,name,role,amount,team,country from player where team = ?";
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        ConnectionUtil util = ConnectionUtil.getInstance();
        List<Player> playerList = new ArrayList<>();
        try {
            con = util.getConnection();
            pst = con.prepareStatement(sql);
            pst.setString(1, teamName);
            rs = pst.executeQuery();
            while (rs.next()) {
                Player player = new Player();
                player.setId(rs.getLong("id"));
                player.setName(rs.getString("name"));
                player.setRole(rs.getString("role"));
                player.setAmount(rs.getDouble("amount"));
                player.setTeam(rs.getString("team"));
                player.setCountry(rs.getString("country"));
                playerList.add(player);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            util.close(rs, pst, con);
        }
        return playerList;
    }

    @Override
    public List<TeamStatsDto> selectTeamStats() {
        return null;
    }

    @Override
    public List<RoleStatsDto> selectRoleStats(String teamName) {
        return null;
    }

    @Override
    public List<Player> selectTopPaidPlayersOfEachTeam() {
        return null;
    }

}
