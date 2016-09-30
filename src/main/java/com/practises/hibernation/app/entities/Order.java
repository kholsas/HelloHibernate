package com.practises.hibernation.app.entities;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Kholofelo Maloma on 9/29/2016.
 */
@Entity
@Table(name = "Orders")
public class Order {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String orderNumber;
    @Column
    private Date orderDate;
    @Column
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
