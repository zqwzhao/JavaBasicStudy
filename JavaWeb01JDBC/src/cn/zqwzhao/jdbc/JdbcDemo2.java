package cn.zqwzhao.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
*   db3的account表 添加一条记录
* insert 语句
*
* */
public class JdbcDemo2 {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.定义sql
            String sql = "insert into account values(null,'王五',2000)";
            //3.获取connection对象
            connection = DriverManager.getConnection("jdbc:mysql:///db3", "root", "root");
            //4.获取执行mysql的对象statement
            statement = connection.createStatement();
            //5. 执行sql
            int count = statement.executeUpdate(sql); //count代表影响的行数
            //6.处理结果

            System.out.println(count);
            if (count > 0) {
                System.out.println("添加成功");
            }else{
                System.out.println("添加失败");
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            //为了避免空指针异常
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }


        }


    }
}
