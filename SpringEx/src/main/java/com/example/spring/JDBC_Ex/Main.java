package com.example.spring.JDBC_Ex;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mydb", "nmhyrhn", "nhr1234"
            );
            PreparedStatement preparedStatement = connection.prepareStatement("select * from members");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                var user = new Member(
                        resultSet.getLong("id"),
                        resultSet.getString("name"),
                        resultSet.getString("email"),
                        resultSet.getInt("age"));
                System.out.println(user);
            }
            connection.close();
        }
    }