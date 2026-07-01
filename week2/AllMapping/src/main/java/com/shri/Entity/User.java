package com.shri.Entity;

import jakarta.persistence.*;

@Entity
public class User {

    @Id
    private Integer id;
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id") // foreign key column
    private Address address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public User() {
        super();
    }

    public User(Integer id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
}
