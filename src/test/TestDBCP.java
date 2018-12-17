package test;

import util.DBCPUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestDBCP {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = "select * from iw_user where username = ?";
        try {
            conn = DBCPUtils.getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "lojn");
            rs = pstmt.executeQuery();
            if (rs.next()) {
                System.out.println(rs.getString("password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}