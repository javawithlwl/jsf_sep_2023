package com.careerit.jdbc.util;

import java.sql.*;

public final class ConnectionUtil {

    private volatile static ConnectionUtil obj;
    private ConnectionUtil() {
    }
    public static ConnectionUtil getInstance() {
        if (obj == null) {
            synchronized (ConnectionUtil.class){
                if(obj == null){
                    obj = new ConnectionUtil();
                }
            }
        }
        return obj;
    }
    public  Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:postgresql://dpg-ck4g4mk2kpls73dt13p0-a.oregon-postgres.render.com:5432/lwl_db", "dbuser", "JvL42pV5YmRGIcYhGmXooU8yRBAHm3zi");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    public  void close(Statement st, Connection con) {
        close(null, st, con);
    }

    public  void close(ResultSet rs, Statement st, Connection con) {
        try {
            if (rs != null) {
                rs.close();
            }
            if (st != null) {
                st.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
