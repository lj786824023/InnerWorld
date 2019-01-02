package dao;

import entity.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import util.C3P0Utils;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {

    @Override
    public boolean login(User u) {
        User user = null;
        QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
        String sql = "select * from iw_user t1 where t1.username=?";
        Object[] param = {u.getUsername()};
        try {
            user = qr.query(sql, new BeanHandler<>(User.class), param);
            if (user.getPassword() == null) {
                System.out.println("用户不存在！");
                return false;
            } else if (!user.getPassword().equals(u.getPassword())) {
                System.out.println("密码错误！");
                return false;
            } else if (user.getPassword().equals(u.getPassword())) {
                System.out.println("登陆成功！");
                return true;
            } else {
                System.out.println("未知错误！");
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<User> SelectAll() {
        List<User> userList = new ArrayList<User>();
        QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
        String sql = "select * from iw_user";
        Object[] param = {};
        try {
            userList = qr.query(sql, new BeanListHandler<User>(User.class),param);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
    }
}
