package com.shri.enity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Passport {

    @Id
    private Integer id;
    private String number;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Passport(Integer id, String number, User user) {
		super();
		this.id = id;
		this.number = number;
		this.user = user;
	}

	@Override
	public String toString() {
		return "Passport [id=" + id + ", number=" + number + ", user=" + user + "]";
	}

	public Passport() {
		super();
		// TODO Auto-generated constructor stub
	}
	

    // getters setters
    
}
