package com.wolffdev.bugtrackerv2.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Bug {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String description, state;
    private int votes, criticality;

    @ManyToOne(fetch = FetchType.LAZY)

    @JoinColumn(name = "developer")
    private Developer developer;

    //constructor


    public Bug() {
    }

    public Bug(String description, String state, int criticality, Developer developer) {
        super();
        this.description = description;
        this.state = state;
        this.criticality = criticality;
        this.developer = developer;
    }


    //setters and getters


    public Developer getDeveloper() {
        return developer;
    }

    public void setDeveloper(Developer developer) {
        this.developer = developer;
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

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public int getCriticality() {
        return criticality;
    }

    public void setCriticality(int criticality) {
        this.criticality = criticality;
    }
}
