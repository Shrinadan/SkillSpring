package com.shri.enity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class User {

    @Id
    private Integer id;
    private String name;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Passport> passports;
    
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
	public User(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	 public List<Passport> getPassports() {
	        return passports;
	    }

	    public void setPassports(List<Passport> passports) {
	        this.passports = passports;
	    }
		public User(Integer id, String name, List<Passport> passports) {
			super();
			this.id = id;
			this.name = name;
			this.passports = passports;
		}
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
	    

    
    // getters setters
}
