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
    public boolean login(User user) {
        User u = null;
        QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
        String sql = "select * from iw_user t1 where t1.username=?";
        Object[] param = {user.getUsername()};
        try {
            u = qr.query(sql, new BeanHandler<>(User.class), param);
            if (u.getPassword() == null) {
                System.out.println("用户不存在！");
                return false;
            } else if (!u.getPassword().equals(user.getPassword())) {
                System.out.println("密码错误！");
                return false;
            } else if (u.getPassword().equals(user.getPassword())) {
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
            userList = qr.query(sql, new BeanListHandler<User>(User.class), param);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
    }

    @Override
    public int insert(User user) {
        int update = 0;
        QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
        String sql = "insert into iw_user values(?,?,?,?,?)";
        Object[] param = {user.getUsername(), user.getPassword(), user.getName(), user.getPhone_number(), user.getMail()};
        try {
            update = qr.update(sql, param);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return update;
    }

    @Override
    public int delete(User user) {
        int update = 0;
        QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
        String sql = "delete from iw_user where username=?";
        Object[] param = {user.getUsername()};
        try {
            update = qr.update(sql, param);
        } catch (SQLException e) {
            System.out.println("delete异常");
            e.printStackTrace();
        }
        return update;
    }

    @Override
    public int update(User user) {
        int update = 0;
        QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
        String sql = "update iw_user set password=?,name=?,phone_number=?,mail=? where username=?";
        Object[] param = {user.getPassword(), user.getName(), user.getPhone_number(), user.getMail(), user.getUsername()};
        try {
            update = qr.update(sql, param);
        } catch (SQLException e) {
            System.out.println("update异常");
            e.printStackTrace();
        }
        return update;
    }
}
