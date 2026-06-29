package com.shrinan.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String discription;

    public Book() {
        // required by JPA & Jackson
    }

    public Book(Integer id, String name, String add) {
        this.id = id;
        this.name = name;
        this.discription = discription;
    }

    public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

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

    public String getAdd() {
        return discription;
    }

    public void setAdd(String add) {
        this.discription= discription;
    }
}

