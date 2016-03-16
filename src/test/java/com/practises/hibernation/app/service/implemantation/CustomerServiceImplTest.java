package com.practises.hibernation.app.service.implemantation;

import com.practises.hibernation.app.entities.Customer;
import com.practises.hibernation.app.service.CustomerService;
import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.*;

/**
 * Created by Kholofelo Maloma on 2016/03/16.
 */
public class CustomerServiceImplTest {

    private CustomerService customerService;
    private Calendar calendar = Calendar.getInstance();

    @Before
    public void setUp() {
        customerService = new CustomerServiceImpl();
    }

    @Test
    public void testAddCustomer() {

        calendar.set(1999, 12, 12);
        customerService.addCustomer(new Customer("123", "Test man", "Last man", calendar.getTime()));

        assertNotNull(customerService.getAllCustomers());
        assertFalse(customerService.getAllCustomers().isEmpty());
    }

    @Test
    public void testRemoveCustomer() {

    }

    @Test
    public void testGetCustomerWithNationalId() {
        calendar.set(2009, 12, 12);
        final String nationalID = "909090";
        Customer customer = new Customer(nationalID, "Kholofelo", "Maloma", calendar.getTime());
        customerService.addCustomer(customer);

        Customer actual = customerService.getCustomerWithNationalID(nationalID);
        assertNotNull(actual);
        assertEquals(customer.getFirstName(), actual.getFirstName());
        assertEquals(customer.getLastName(), actual.getLastName());
        assertEquals(customer.getNationalID(), actual.getNationalID());
    }
}