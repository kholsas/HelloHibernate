package com.practises.hibernation.app.jdbc;

/**
 * Created by kholofelo on 2016/04/27.
 */
public class Customer  {

    private int id;

    private String firstName;

    private String lastName;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
