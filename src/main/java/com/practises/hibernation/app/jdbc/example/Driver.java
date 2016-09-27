package com.practises.hibernation.app.jdbc.example;

import com.practises.hibernation.app.jdbc.Customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Created by kholofelo on 2016/09/27.
 */
public class Driver {

    public static void main(String[] args) {
        try {
            // create a mysql database connection
            String myDriver = "com.mysql.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost:3306/testing";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "password");

            // create a sql date object so we can use it in our INSERT statement
            Customer customer = getSampleCustomer(1);
            // the mysql insert statement
            String query = " insert into Customers (id, firstName, lastName)"
                    + " values (?, ?, ?)";

            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setInt(1, customer.getId());
            preparedStmt.setString(2, customer.getFirstName());
            preparedStmt.setString(3, customer.getLastName());

            // execute the preparedstatement
            preparedStmt.execute();

            conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }

    private static Customer getSampleCustomer(int id) {
        Customer customer = new Customer();
        customer.setId(id);
        customer.setFirstName("Kholofelo");
        customer.setLastName("Maloma");
        return customer;
    }

}
