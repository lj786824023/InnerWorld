package util;

import org.apache.commons.dbcp.BasicDataSourceFactory;
import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class DBCPUtils {

    private static DataSource dataSource;

    static {
        try {
            InputStream is = DBCPUtils.class.getResourceAsStream("/db.properties");
            Properties pop = new Properties();
            pop.load(is);
            dataSource = BasicDataSourceFactory.createDataSource(pop);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static DataSource getDataSource(){
        return dataSource;
    }

    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
}
