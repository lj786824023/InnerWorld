package util;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class C3P0Utils {
    private static DataSource dataSource = new ComboPooledDataSource("innerworld");

    public static DataSource getDataSource() {
        return dataSource;
    }

    //从c3p0中取得一个连接
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
}
