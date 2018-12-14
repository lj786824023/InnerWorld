package test;

import org.junit.Test;
import util.DBUtils;

import java.sql.*;

public class TestDBUtils {
    public static void main(String[] args) {
        TestDBUtils t = new TestDBUtils();
        t.DBUtils_v1();
    }

    public void DBUtils_v1() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = "select * from iw_user where username = ?";

        {
            try {
                conn = DBUtils.getConnection();
                pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, "lojn");
                rs = pstmt.executeQuery();
                if (rs.next()) {
                    System.out.println(rs.getString(1) + "," + rs.getString(2));
                }
            } catch (SQLException e) {
                e.printStackTrace();
                DBUtils.release(conn, pstmt, rs);
            }
        }
    }
}
