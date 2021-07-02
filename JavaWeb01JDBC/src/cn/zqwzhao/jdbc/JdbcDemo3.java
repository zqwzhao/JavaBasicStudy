package cn.zqwzhao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
*   account 表 修改记录
* */
public class JdbcDemo3 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement statement = null;
        //1.注册驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取连接对象
            conn = DriverManager.getConnection("jdbc:mysql:///db3", "root", "root");
            //3.定义sql语句
            String sql = "update account set balance = 2000 where id = 1";
            //4.获取执行sql对象
            statement = conn.createStatement();
            //6.执行sql语句
            int count = statement.executeUpdate(sql);

            //处理结果
            System.out.println(count);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }

    }

}
