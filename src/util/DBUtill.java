package util;


import java.sql.*;

public class DBUtill {
    static String url = "jdbc:mysql://localhost:3306/innerworld";
    //?useUnicode=true&characterEncoding=UTF-8
    static String username = "root";
    static String password = "root";
    static Connection conn = null;
    static ResultSet rs = null;
    static PreparedStatement psmt = null;

    public static void init() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            System.out.println("init [SQL驱动程序初始化失败!]");
            e.printStackTrace();
        }
    }

    public static int addDelUpd(String sql) {
        int i = 0;
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            i = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("sql数据库增删改异常");
            e.printStackTrace();
        }

        return i;
    }

    public static ResultSet select(String sql) {
        try {
            PreparedStatement psmt = conn.prepareStatement(sql);
            rs = psmt.executeQuery(sql);
        } catch (SQLException e) {
            System.out.println("sql数据库查询异常");
            e.printStackTrace();
        }
        return rs;
    }

    public static void release() {
        try {
            conn.close();
        } catch (SQLException e) {
            System.out.println("sql数据库关闭异常");
            e.printStackTrace();
        }
    }
}