package com.wzh.rochang;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class rNumber {
    private static final String DRIVER="com.mysql.jdbc.Driver";//在jar包里
    private static final String URL="jdbc:mysql://localhost:3306/test?characterEncoding=utf-8";//激动bc:mysql://localhost(本机)：3306 或者服务器ip(同一网端)/数据库名
    private static final String USER="root";
    private static final String PWD="123456";

    public static Connection getConnection() {
        Connection con=null;
        try {
            Class.forName(DRIVER);//注册数据库驱动，java中没有能连接数据库的东西，需要添加jar包得到外部驱动
            con= DriverManager.getConnection(URL,USER,PWD);

        } catch (Exception e) {
            // TODO: handle exception

        }
        System.out.println("获取的连接对象"+con);
        return con;
    }
    public static void main(String[] args) throws ClassNotFoundException{
        // TODO Auto-generated method stub
        Connection con = null;
        Statement stmt=null;
        ResultSet rs=null;
        Class.forName(DRIVER);

        try {
            con=getConnection();
            stmt=con.createStatement();
            String sql="inset into student (2016031,'"+"范闲"+"','"+"2018-10-09"+"','"+"男"+"');";
            String sql1="delete from student where id=2016016;";
            int i =stmt.executeUpdate(sql);
            if (i>0) {
                System.out.println("成功");

            }
            else System.out.println("失败");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        finally {
            close(rs, stmt, con);
        }

    }
    private static void close(ResultSet rs, Statement stmt, Connection con) {
        try {
            if(rs!=null) {
                rs.close();
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        try {
            if(stmt!=null) {
                stmt.close();
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        try {
            if(con!=null) {
                con.close();
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
