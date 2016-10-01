package com.practises.hibernation.app.jdbc.example.config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by Kholofelo on 9/29/2016.
 */
public class JDBCFactory {

    public static Connection getDatabaseConnection() {
        // create a mysql database connection
        String myDriver = "com.mysql.jdbc.Driver";
        String myUrl = "jdbc:mysql://localhost:3306/testingJDBC";
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
