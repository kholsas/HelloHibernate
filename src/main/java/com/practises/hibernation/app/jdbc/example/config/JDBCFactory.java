package com.practises.hibernation.app.jdbc.example.config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by F4929217 on 9/29/2016.
 */
public class JDBCFactory {

    public static Connection getDatabaseConnection() {
        // create a mysql database connection
        String myDriver = "com.mysql.jdbc.Driver";
        String myUrl = "jdbc:mysql://localhost:3306/testing";
        Connection conn = null;
        try {
            Class.forName(myDriver);
            conn = DriverManager.getConnection(myUrl, "root", "password");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return conn;
    }
}
