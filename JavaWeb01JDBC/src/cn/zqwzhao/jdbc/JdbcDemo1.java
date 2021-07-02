package cn.zqwzhao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
* 1. 导入驱动jar包 mysql-connector-java-5.1.37-bin.jar
			1.复制mysql-connector-java-5.1.37-bin.jar到项目的libs目录下
			2.右键-->Add As Library
		2. 注册驱动
		3. 获取数据库连接对象 Connection
		4. 定义sql
		5. 获取执行sql语句的对象 Statement
		6. 执行sql，接受返回结果
		7. 处理结果
		8. 释放资源
		*
*
* */
public class JdbcDemo1 {
    public static void main(String[] args) throws Exception {
        //2. 注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //3. 获取数据库连接对象 Connection
        //url : jdbc:mysql://ip地址(域名):端口号/数据库名称
        //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3", "root", "root");
        Connection conn = DriverManager.getConnection("jdbc:mysql:///db3", "root", "root");
        //4. 定义sql
        //String sql = "update account set balance = 1000 where id = 1";
        String sql = "update account set balance = 1000 ";
        //5. 获取执行sql语句的对象 Statement

        Statement stam = conn.createStatement();
        //6. 执行sql，接受返回结果
        int i = stam.executeUpdate(sql);
        //7. 处理结果
        System.out.println(i);
        //8. 释放资源
        stam.close();
        conn.close();
    }
}
