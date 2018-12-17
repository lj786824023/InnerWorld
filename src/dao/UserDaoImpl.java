package dao;

import entity.User;
import util.DBSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDaoImpl implements UserDao {

    @Override
    public boolean login(User u) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        DBSource myDBSource = new DBSource();
        String sql = "select * from iw_user t1 where t1.username=?";
        try {
            conn = myDBSource.getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, u.getUsername());
            rs=pstmt.executeQuery();
            if (!rs.next()) {
                System.out.println("用户不存在！");
                return false;
            } else if (!rs.getString("password").equals(u.getPassword())) {
                System.out.println("密码错误！");
                return false;
            } else {
                System.out.println("登陆成功！");
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            myDBSource.closeRsPstmt(rs, pstmt);
            myDBSource.backConnection(conn);
        }
        return false;
    }
}
