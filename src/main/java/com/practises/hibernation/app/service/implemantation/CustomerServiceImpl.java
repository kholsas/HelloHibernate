package com.practises.hibernation.app.service.implemantation;

import com.practises.hibernation.app.data.config.HibernateUtils;
import com.practises.hibernation.app.entities.Customer;
import com.practises.hibernation.app.service.CustomerService;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

/**
 * Created by Kholofelo Maloma on 2016/03/15.
 */
public class CustomerServiceImpl implements CustomerService {

    public void addCustomer(Customer customer) {

        Session session = HibernateUtils.getSessionFactory().openSession();
        session.beginTransaction();
        session.saveOrUpdate(customer);

        session.getTransaction().commit();
        session.close();
    }

    public boolean removeCustomer(long id) {
        return false;
    }

    public Customer getCustomer(long id) {

        Session session = HibernateUtils.getSessionFactory().openSession();
        session.beginTransaction();
        Customer customer = (Customer) session.get(Customer.class, id);

        session.getTransaction().commit();
        session.close();
        return customer;
    }

    public List<Customer> getAllCustomers() {
        Session session = HibernateUtils.getSessionFactory().openSession();
        session.beginTransaction();

        List<Customer> allCustomers = session.createCriteria(Customer.class).list();
        return allCustomers;
    }

    public Customer getCustomerWithNationalID(String nationalID) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        session.beginTransaction();
        Customer customer = (Customer) session.createCriteria(Customer.class).add(Restrictions.eq("nationalID", nationalID)).uniqueResult();

        session.getTransaction().commit();
        session.close();
        return customer;
    }
}
