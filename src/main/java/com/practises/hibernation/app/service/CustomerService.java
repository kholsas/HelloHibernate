package com.practises.hibernation.app.service;

import com.practises.hibernation.app.entities.Customer;

/**
 * Created by Kholofelo Maloma on 2016/03/15.
 */
public interface CustomerService {

    /**
     *
     * @param customer new customer object
     */
    void addCustomer(Customer customer);

    /**
     *
     * @param id customer id
     * @return false if customer with a given id was not found, true if found and removed
     */
    boolean removeCustomer(long id);

    /**
     *
     * @param id customer id
     * @return Customer with a given id
     */
    Customer getCustomer(long id);

}
