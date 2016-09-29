package com.practises.hibernation.app.hibernate.conf;

/**
 * Created by Kholofelo Maloma on 2016/03/15.
 */

import com.practises.hibernation.app.entities.Customer;
import com.practises.hibernation.app.entities.Order;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;


@SuppressWarnings("deprecation")
public class HibernateUtils {

    private static final SessionFactory sessionFactory;

    static {
        try {
            AnnotationConfiguration configuration = new AnnotationConfiguration().configure();
            /**
             * Configuration uses a resource file, hibernate.cfg.xml
             * NOTE: Full configuration could be done using annotation
             */
            configuration.addAnnotatedClass(Customer.class);
            configuration.addAnnotatedClass(Order.class);
            sessionFactory = configuration.buildSessionFactory();

        } catch (Throwable ex) {
            System.err.println("Session Factory could not be created." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}