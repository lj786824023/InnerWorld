package test;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import util.C3P0Utils;

import java.sql.SQLException;

public class TestDBUtils {
    public static void main(String[] args) {
        QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
        String sql = "update iw_user set password=? where username=?";
        Object[] param = {"lojn","lojn"};
        try {
            int row = qr.update(sql, param);
            System.out.println(row);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
