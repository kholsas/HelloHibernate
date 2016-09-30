package com.practises.hibernation.app.entities;

import javax.persistence.*;

/**
 * Created by Kholofelo Maloma on 9/29/2016.
 */
@Entity
@Table(name = "Contacts")
public class Contact {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    @Enumerated(EnumType.STRING)
    private ContactType contactType;
    @Column
    private String contactDetail;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer customer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ContactType getContactType() {
        return contactType;
    }

    public void setContactType(ContactType contactType) {
        this.contactType = contactType;
    }

    public String getContactDetail() {
        return contactDetail;
    }

    public void setContactDetail(String contactDetail) {
        this.contactDetail = contactDetail;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public enum ContactType {
        EMAIL("eMail"),
        TELL_H("Home Tel."),
        TELL_W("Work Tel."),
        CELL_PHONE("Cell Phone");

        private final String value;

        ContactType(final String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
}
