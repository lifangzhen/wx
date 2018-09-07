package com.lz.wx.model;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by 26949 on 2018/9/5.
 */
@Entity
@Table(name = "school")
@DynamicInsert
@DynamicUpdate
public class School {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "location")
    private String location;
    @Column(name = "rector")
    private String rector;
    @Column(name = "contacts")
    private String contacts;
    @Column(name = "number")
    private int  number;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRector() {
        return rector;
    }

    public void setRector(String rector) {
        this.rector = rector;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public int  getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number=number;
    }
}
