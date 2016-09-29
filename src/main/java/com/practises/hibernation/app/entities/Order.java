package com.practises.hibernation.app.entities;

import java.util.Date;

/**
 * Created by Kholofelo Maloma on 9/29/2016.
 */
public class Order {

    private int id;

    private String orderNumber;
    private Date orderDate;
    private String customerName;
    //we could add a collection of OrderItems. To make this as simple as possible, we left that out!


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
