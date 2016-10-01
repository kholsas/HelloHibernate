package com.practises.hibernation.app.hibernate.basic;

import com.practises.hibernation.app.data.dao.BusinessDAO;
import com.practises.hibernation.app.entities.Customer;
import com.practises.hibernation.app.entities.Order;
import com.practises.hibernation.app.hibernate.conf.HibernateUtils;
import org.hibernate.Session;

/**
 * Created by Kholofelo on 9/29/2016.
 */
public class HibernateBusinessDAOImpl implements BusinessDAO {


    public void saveCustomer(Customer customer) {
        saveEntity(customer);
    }

    public void saveOrder(Order order) {
        saveEntity(order);
    }

    public <T> void saveEntity(T entity) {

        Session session = HibernateUtils.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(entity);

        session.getTransaction().commit();
        session.close();
    }
}
