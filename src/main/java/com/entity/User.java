package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/* The @Entity annotation marks this class as a JPA entity. 
 * Entities are used to model database tables.*/
@Entity
@Table(name = "user_dtls")
public class User {

	@Id
	/*The @GeneratedValue annotation specifies that the primary key 
	 * values will be generated automatically using an identity column in the database. */
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "fullname")
	private String fullname;
	private String email;
	private String password;
	private String about;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	//Constructor for initializing the object with values.
	public User(String fullname, String email, String password, String about) {
		super();
		this.fullname = fullname;
		this.email = email;
		this.password = password;
		this.about = about;
	}
	/*  Getter and setter methods in Java classes are used 
	 *  to access and modify the private attributes of an object.
	 *  They are an essential part of encapsulation, allowing controlled access
	 *  to the internal state of an object.*/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", fullname=" + fullname + ", email=" + email + ", password=" + password + ", about="
				+ about + "]";
	}
	
	
	
}
