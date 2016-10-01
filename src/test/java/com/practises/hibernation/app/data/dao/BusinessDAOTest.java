package com.practises.hibernation.app.data.dao;

import com.practises.hibernation.app.entities.Customer;
import com.practises.hibernation.app.entities.Order;
import com.practises.hibernation.app.hibernate.basic.HibernateBusinessDAOImpl;
import com.practises.hibernation.app.jdbc.JDBCBusinessDAOImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by Kholofelo Maloma on 19/06/2016.
 */
public class BusinessDAOTest {
    private BusinessDAO businessDAO;

    @Before
    public void setUp() {
        businessDAO = new JDBCBusinessDAOImpl();
    }

    @Test
    public void saveCustomer() throws Exception {
        Customer customer = new Customer();
        customer.setFirstName("No!Shirt");
        customer.setLastName("Maloma");
        customer.setNationalID("000000000");

        businessDAO.saveCustomer(customer);


    }

    @Test
    public void saveOrder() throws Exception {

    }

    @Test
    public void testSaveEntity() {
        Order order = new Order();
        order.setCustomerName("Hello name");
        order.setOrderDate(new Date().toString());
        order.setOrderNumber("7474KOL");
 /*       Customer customer = new Customer();
        customer.setFirstName("Kabelo");
        customer.setLastName("Khoza");
        customer.setNationalID("000000000");
*/
        businessDAO.saveEntity(order);
    }
}