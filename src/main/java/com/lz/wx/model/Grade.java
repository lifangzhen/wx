package com.lz.wx.model;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by 26949 on 2018/9/9.
 */
@Entity
@Table(name = "grade")
@DynamicInsert
@DynamicUpdate
public class Grade {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "language")
    private int language;
    @Column(name = "mathematics")
    private int mathematics;
    @Column(name = "English")
    private int english;

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

    public int getLanguage() {

        return language;
    }

    public void setLanguage(int language) {
        this.language = language;
    }

    public int getMathematics() {

        return mathematics;
    }

    public void setMathematics(int mathematics) {
        this.mathematics = mathematics;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }
}
