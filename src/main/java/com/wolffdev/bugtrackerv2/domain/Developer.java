package com.wolffdev.bugtrackerv2.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Developer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long developerid;
    private String firstname, lastname;



    @OneToMany(cascade = CascadeType.ALL, mappedBy="developer")
    @JsonIgnore
    private List<Bug> bugs;

    public Developer(){}

    public Developer(String firstname, String lastname) {
        super();
        this.firstname = firstname;
        this.lastname = lastname;
    }


    //Getter and setter
    public List<Bug> getBugs() {
        return bugs;
    }

    public void setBugs(List<Bug> bugs) {
        this.bugs = bugs;
    }

    public long getDeveloperid() {
        return developerid;
    }

    public void setDeveloperid(long developerid) {
        this.developerid = developerid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
