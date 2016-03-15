package com.practises.hibernation.app.service.implemantation;

import com.practises.hibernation.app.data.config.HibernateUtils;
import com.practises.hibernation.app.entities.Customer;
import com.practises.hibernation.app.service.CustomerService;
import org.hibernate.Session;

/**
 * Created by Kholofelo Maloma on 2016/03/15.
 */
public class CustomerServiceImpl implements CustomerService {

    public void addCustomer(Customer customer) {

        Session session = HibernateUtils.getSessionFactory().openSession();
        session.beginTransaction();
        session.persist(customer);

        session.getTransaction().commit();
        session.close();
    }

    public boolean removeCustomer(long id) {
        return false;
    }

    public Customer getCustomer(long id) {
        return null;
    }
}
