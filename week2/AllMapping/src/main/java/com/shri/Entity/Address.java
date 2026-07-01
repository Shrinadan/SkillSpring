package com.shri.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Address {

    @Id
    private Integer id;
    private String village;
    private String dist;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getDist() {
        return dist;
    }

    public void setDist(String dist) {
        this.dist = dist;
    }

    public Address() {
        super();
    }

    public Address(Integer id, String village, String dist) {
        this.id = id;
        this.village = village;
        this.dist = dist;
    }
}
