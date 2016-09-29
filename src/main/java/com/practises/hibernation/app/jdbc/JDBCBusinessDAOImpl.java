package com.practises.hibernation.app.jdbc;

import com.practises.hibernation.app.data.dao.BusinessDAO;
import com.practises.hibernation.app.entities.Customer;
import com.practises.hibernation.app.entities.Order;
import com.practises.hibernation.app.jdbc.example.config.JDBCFactory;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

/**
 * Created by Kholofelo on 9/29/2016.
 */
public class JDBCBusinessDAOImpl implements BusinessDAO {


    public void saveCustomer(final Customer customer) {
        Connection conn = JDBCFactory.getDatabaseConnection();
        // the mysql insert statement
        String query = " insert into Customers (id, firstName, lastName)"
                + " values (?, ?, ?)";

        try {
            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setInt(1, customer.getId());
            preparedStmt.setString(2, customer.getFirstName());
            preparedStmt.setString(3, customer.getLastName());

            // execute the preparedstatement
            preparedStmt.execute();
            conn.close();
        } catch (Exception e) {
            System.err.println("Failed to save customer");
            e.printStackTrace();
        }
    }

    public void saveOrder(final Order order) {
        Connection conn = JDBCFactory.getDatabaseConnection();
        // the mysql insert statement
        String query = " insert into Orders (id, orderNumber, customerName, orderDate)"
                + " values (?, ?, ?, ?)";

        try {
            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setInt(1, order.getId());
            preparedStmt.setString(2, order.getCustomerName());
            preparedStmt.setString(3, order.getCustomerName());
            preparedStmt.setDate(4, new Date(order.getOrderDate().getTime()));

            // execute the preparedstatement
            preparedStmt.execute();
            conn.close();
        } catch (Exception e) {
            System.err.println("Failed to save customer");
            e.printStackTrace();
        }
    }
}
