package test;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import util.C3P0Utils;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestC3P0 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = "select * from iw_user where username = ?";
        try {
            conn = C3P0Utils.getConnection();
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
