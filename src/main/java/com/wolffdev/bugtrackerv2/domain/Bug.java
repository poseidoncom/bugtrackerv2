package com.wolffdev.bugtrackerv2.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bug {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String description, state;
    private int date, criticality;

    //constructor


    public Bug() {
    }

    public Bug(long id, String description, String state, int date, int criticality) {
        this.id = id;
        this.description = description;
        this.state = state;
        this.date = date;
        this.criticality = criticality;
    }


    //setters and getters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getCriticality() {
        return criticality;
    }

    public void setCriticality(int criticality) {
        this.criticality = criticality;
    }
}
