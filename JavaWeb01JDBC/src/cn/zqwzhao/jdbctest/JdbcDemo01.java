package cn.zqwzhao.jdbctest;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        List<Emp> list  = new JdbcDemo01().findAll();
        System.out.println(list);
    }
    public List<Emp> findAll(){
        Connection conn = null;
        Statement stat =null;
        ResultSet resultSet = null;
        List<Emp> list = null;

        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");

            //2.获取连接对象
            conn = DriverManager.getConnection("jdbc:mysql:///db3", "root", "root");

            //3.定义sql
            String sql = "select * from account";

            //4.获取sql执行对象
            stat = conn.createStatement();
            //5.执行sql
            resultSet = stat.executeQuery(sql);

            Emp emp = null;
            list = new ArrayList<>();
            while(resultSet.next()) {
                int id = resultSet.getInt("id");
                String ename = resultSet.getString("ename");
                int job_id = resultSet.getInt("job_id");
                int mgr = resultSet.getInt("mgr");
                Date joindate = resultSet.getDate("joindate");
                double salary = resultSet.getDouble("salary");
                double bonus = resultSet.getDouble("bonus");
                int dept_id = resultSet.getInt("dept_id");
                emp = new Emp(id,ename,job_id,mgr,joindate,salary,bonus,dept_id);

                //装载集合
                list.add(emp);

            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
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

        return list;
        }


}
