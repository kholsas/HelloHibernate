package com.practises.hibernation.app.entities;

import javax.persistence.*;

/**
 * Created by Kholofelo Maloma on 9/29/2016.
 */
@Entity
@Table(name = "OrderItems")
public class OrderItem {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String orderItemNumber;

    @Column
    private String orderItemName;
    @Column
    private double price;
    @Column
    private int quantity;
/*

    @ManyToOne(fetch = FetchType.LAZY , cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id", referencedColumnName = "id", nullable = false)
    private Order order;
*/

    public OrderItem(){}

    public OrderItem(String orderNumber, double price, int quantity, String orderItemName, Order order) {
        this.orderItemNumber = orderNumber;
        this.price = price;
        this.quantity = quantity;
        this.orderItemName = orderItemName;
//        this.order = order;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderItemNumber() {
        return orderItemNumber;
    }

    public void setOrderItemNumber(String orderItemNumber) {
        this.orderItemNumber = orderItemNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getOrderItemName() {
        return orderItemName;
    }

    public void setOrderItemName(String orderItemName) {
        this.orderItemName = orderItemName;
    }
/*
    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }*/
}