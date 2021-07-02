
package cn.zqwzhao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 删除account表中的一条数据
 * */
public class JdbcDemo5 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stat = null;
        try{
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取连接对象
            conn = DriverManager.getConnection("jdbc:mysql:///db3", "root", "root");

            //3.定义sql语句
            String sql = "create table stu(id int , name varchar(10))";

            //4.获取执行sql对象
            stat = conn.createStatement();

            //执行sql
            int i = stat.executeUpdate(sql);
            System.out.println(i);
            if (i == 0) {
                System.out.println("执行成功");
            }else {
                System.out.println("执行失败");
            }

        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (stat != null) {
                try {
                    stat.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
