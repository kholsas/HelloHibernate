package com.practises.hibernation.app.data.dao;

import com.practises.hibernation.app.entities.Contact;
import com.practises.hibernation.app.entities.Customer;
import com.practises.hibernation.app.hibernate.basic.HibernateBusinessDAOImpl;
import org.junit.Before;
import org.junit.Test;

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

        Contact contact = new Contact();
        contact.setContactType(Contact.ContactType.EMAIL);
        contact.setContactDetail("sample@psybergate.co.za");


        customer.setGoodContact(contact);

        businessDAO.saveCustomer(customer);
    }


    private void getContact(){
       Contact.ContactType contactType =  Contact.ContactType.valueOf("EMAIL");
    }
    @Test
    public void saveOrder() throws Exception {

    }

    @Test
    public void testSaveEntity() {
   /*     Order order = new Order();
        order.setCustomerName("Hello name");
        order.setOrderDate(new Date());
        order.setOrderNumber("7474KOL");*/
        Customer customer = new Customer();
        customer.setFirstName("Kabelo");
        customer.setLastName("Khoza");
        customer.setNationalID("000000000");
        businessDAO.saveEntity(customer);
    }
}