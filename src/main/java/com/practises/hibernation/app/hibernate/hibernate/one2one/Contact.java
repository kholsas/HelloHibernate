package com.practises.hibernation.app.hibernate.hibernate.one2one;

import javax.persistence.*;

/**
 * Created by kholofelo on 2016/09/27.
 */

@Entity(name = "Contacts")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    @Enumerated(EnumType.STRING)
    private ContactType contactType;

    @Column
    private String contactValue;

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

    public String getContactValue() {
        return contactValue;
    }

    public void setContactValue(String contactValue) {
        this.contactValue = contactValue;
    }

    public enum ContactType  {
        EMAIL("Email"),
        HOME_TEL("Home Tel"),
        CELL_PHONE("Cell");

        private final String value;

        ContactType(final String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
}
