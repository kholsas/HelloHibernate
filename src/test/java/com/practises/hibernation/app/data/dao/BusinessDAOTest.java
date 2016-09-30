package com.practises.hibernation.app.data.dao;

import com.practises.hibernation.app.entities.Customer;
import com.practises.hibernation.app.entities.Order;
import com.practises.hibernation.app.entities.OrderItem;
import com.practises.hibernation.app.hibernate.basic.HibernateBusinessDAOImpl;
import com.practises.hibernation.app.jdbc.JDBCBusinessDAOImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by F4929217 on 9/30/2016.
 */
public class BusinessDAOTest {
    private BusinessDAO businessDAO;

    @Before
    public void setUp() {
        businessDAO = new HibernateBusinessDAOImpl();
    }

    @Test
    public void saveCustomer() throws Exception {
        Customer customer = new Customer();
        customer.setFirstName("Kabelo");
        customer.setLastName("Khoza");
        customer.setNationalID("000000000");
        businessDAO.saveCustomer(customer);
    }

    @Test
    public void saveOrder() throws Exception {
        Order order = new Order();
        order.setCustomerName("Hello name");
        order.setOrderDate(new Date());
        order.setOrderNumber("7474KOL");

        List<OrderItem> orderItems = new ArrayList<OrderItem>();
        orderItems.add(new OrderItem("0001", 850.99, 2, "Black leather glasses", order));
        orderItems.add(new OrderItem("0002", 17.50, 12, "6 Apple pack", order));
        orderItems.add(new OrderItem("0003",1650,1, "iTouch 5' Android 9.0" , order));
        order.setOrderItems(orderItems);

        businessDAO.saveOrder(order);
    }

    @Test
    public void testSaveEntity() {
   /*     Order order = new Order();
        order.setCustomerName("Hello name");
        order.setOrderDate(new Date());
        order.setOrderItemNumber("7474KOL");*/
        Customer customer = new Customer();
        customer.setFirstName("Kabelo");
        customer.setLastName("Khoza");
        customer.setNationalID("000000000");
        businessDAO.saveEntity(customer);
    }
}