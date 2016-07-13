package com.structural.bridge.simpledemo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SimpleBridgeDemo {

    public static void main(String[] args) {

        try {

            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
            String connString = "jdbc:derby:memory:codejava/webdb;create=true";
            Connection conn = DriverManager.getConnection(connString);
            Statement statement = conn.createStatement();

            //There is a Bridge in place here that abstracts the user from the specific implementation for each DB (Same code can be used regardless of which DB Driver being used)
            statement.executeUpdate("CREATE TABLE Address (ID INT, StreetName VARCHAR(20), City VARCHAR(20))");
            System.out.println("Table created!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
