package com.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/* The @Entity annotation marks this class as a JPA entity. 
 * Entities are used to model database tables.*/
@Entity
public class Expense {

	@Id
	/*The @GeneratedValue annotation specifies that the primary key 
	 * values will be generated automatically using an identity column in the database. */
	
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	
	/* These are attributes representing columns in the Expense entity.
	 * Each attribute corresponds to a column in the database.
	 * */
	
	private int id;
	private String title;
	private String date;
	private String time;
	private String description;
	private String price;
	
	@ManyToOne
	private User user;
	
	//Constructor for initializing the object with values.
	public Expense(String title, String date, String time, String description, String price, User user) {
		super();
		this.title = title;
		this.date = date;
		this.time = time;
		this.description = description;
		this.price = price;
		this.user = user;
	}
	public Expense() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	
	
}
