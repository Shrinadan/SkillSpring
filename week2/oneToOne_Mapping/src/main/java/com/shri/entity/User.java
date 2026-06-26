package com.shri.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private Integer id;
private String fname;
public String lname;
private String email;
public Integer salary;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Integer getSalary() {
	return salary;
}
public void setSalary( Integer salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "User [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", salary=" + salary + "]";
}
public User(Integer id, String fname, String lname, String email,  Integer salary) {
	super();
	this.id = id;
	this.fname = fname;
	this.lname = lname;
	this.email = email;
	this.salary = salary;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}

}
