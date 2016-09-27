package com.practises.hibernation.app.hibernate.hibernate.one2one;

import javax.persistence.*;

/**
 * Created by kholofelo on 2016/09/27.
 */
public class CustomerB {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "National_ID", nullable = false, unique = true)
    private String nationalID;
    @Column(name = "First_Name", nullable = false)
    private String firstName;
    @Column(name = "Last_Name", nullable = false)
    private String lastName;

    private Contact primaryContact;
}
