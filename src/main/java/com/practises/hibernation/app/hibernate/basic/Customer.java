package com.practises.hibernation.app.hibernate.basic;

import com.practises.hibernation.app.data.config.HibernateUtils;
import org.hibernate.Session;

import javax.persistence.*;

/**
 * Created by Kholofelo Maloma on 2016/03/15.
 */

@Entity(name = "CustomersA")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "National_ID", nullable = false, unique = true)
    private String nationalID;
    @Column(name = "First_Name", nullable = false)
    private String firstName;
    @Column(name = "Last_Name", nullable = false)
    private String lastName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNationalID() {
        return nationalID;
    }

    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}
