package dao;

import entity.User;
import util.DBUtill;

import java.sql.ResultSet;

public class UserDaoImpl implements UserDao {

    @Override
    public boolean login(User u) {
        DBUtill.init();
        String sql = "select * from iw_user t1 where t1.username='" + u.getUsername() + "'";
        try {

            ResultSet rs = DBUtill.select(sql);
            if (!rs.next()) {
                System.out.println("用户不存在！");
                return false;
            } else if (!rs.getString("password").equals(u.getPassword())) {
                System.out.println("密码错误！");
                return false;
            } else {
                System.out.println("登陆成功！");
            }
        } catch (Exception e) {
            System.out.println("Dao异常！");
        } finally {
            DBUtill.release();
        }
        return true;
    }
}
