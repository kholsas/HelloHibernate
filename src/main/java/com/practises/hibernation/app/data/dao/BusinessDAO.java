package com.practises.hibernation.app.data.dao;

import com.practises.hibernation.app.entities.Customer;
import com.practises.hibernation.app.entities.Order;

/**
 * Created by F4929217 on 9/29/2016.
 */
public interface BusinessDAO {

    void saveCustomer(Customer customer);

    void saveOrder(Order order);
}
