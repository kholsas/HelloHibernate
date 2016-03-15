package com.practises.hibernation.app.service;

import com.practises.hibernation.app.entities.Customer;
import com.practises.hibernation.app.service.implemantation.CustomerServiceImpl;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Kholofelo Maloma on 2016/03/15.
 */
public class Demo {

    public static void main(String[] args) {
        CustomerService customerService = new CustomerServiceImpl();

        Calendar calendar = Calendar.getInstance();
        calendar.set(2005, 4,1);
        Customer  customer = new Customer("333333", "Kholofelo", "Maloma" , calendar.getTime());

        customerService.addCustomer(customer);
    }
}
