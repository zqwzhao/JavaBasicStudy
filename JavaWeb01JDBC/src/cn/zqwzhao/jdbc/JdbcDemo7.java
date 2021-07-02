
package cn.zqwzhao.jdbc;

import java.sql.*;

/*
 * 删除account表中的一条数据
 * */
public class JdbcDemo7 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stat = null;
        ResultSet resultSet = null;
        try{
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取连接对象
            conn = DriverManager.getConnection("jdbc:mysql:///db3", "root", "root");

            //3.定义sql语句
            String sql = "select * from account";

            //4.获取执行sql对象

            stat = conn.createStatement();
            //5.执行sql
             resultSet = stat.executeQuery(sql);

             //6.处理结果
            //6.1 让游标向下移动一位
 //           resultSet.next();
//            //6.2获取数据 这个只能获得一条记录
//            int id = resultSet.getInt(1);
//            String name   = resultSet.getString("name");
//            double balance = resultSet.getDouble(3);
//            System.out.println(id + "--- " + name + "----" + balance);
            //6 获取数据 所有结果
            while (resultSet.next()) {
                //循环判断结果集是否有下一行  判断游标是否是最后一行
                //获取数据
                int id = resultSet.getInt(1);
                String name   = resultSet.getString("name");
                double balance = resultSet.getDouble(3);
                System.out.println(id + "--- " + name + "----" + balance);

            }
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {

            if (resultSet != null) {
                try {
                    resultSet.close();
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
