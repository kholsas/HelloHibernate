package com.practises.hibernation.app.hibernate.basic;

import com.practises.hibernation.app.data.config.HibernateUtils;
import org.hibernate.Session;

/**
 * Created by kholofelo on 2016/09/27.
 */
public class Driver {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setFirstName("Hello Me");
        customer.setLastName("Zazazu");
        customer.setNationalID("44444");
        addCustomer(customer);
    }

    public static void addCustomer(Customer customer) {

        Session session = HibernateUtils.getSessionFactory().openSession();
        session.beginTransaction();
        session.saveOrUpdate(customer);

        session.getTransaction().commit();
        session.close();
    }

}
