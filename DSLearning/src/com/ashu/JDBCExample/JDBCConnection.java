package com.ashu.JDBCExample;

import java.sql.*;

public class JDBCConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/micro_admin";
        String username = "root";
        String password = "root";

        try(Connection conn = DriverManager.getConnection(url,username,password);) {
            String sqlQuery = "select likable_id from likes limit 5";

            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery(sqlQuery);
            System.out.println("Db connection is successfull.");
            while(rs.next()){
                int likableId = rs.getInt("likable_id");
                System.out.println("Likable ID: " + likableId);
            }

        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
