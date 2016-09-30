package com.practises.hibernation.app.data.dao;

import com.practises.hibernation.app.entities.Customer;
import com.practises.hibernation.app.entities.Order;

/**
 * Created by Kholofelo Maloma on 9/29/2016.
 */
public interface BusinessDAO {

    void saveCustomer(Customer customer);

    void saveOrder(Order order);

     <T> void saveEntity(T object);
}
