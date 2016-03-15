package com.practises.hibernation.app.data.config;

/**
 * Created by Kholofelo Maloma on 2016/03/15.
 */
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;


@SuppressWarnings("deprecation")
public class HibernateUtils {

    private static final SessionFactory sessionFactory;

    static{
        try{
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();

        }catch (Throwable ex) {
            System.err.println("Session Factory could not be created." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}