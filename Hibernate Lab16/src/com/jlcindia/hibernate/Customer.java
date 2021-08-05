package com.jlcindia.hibernate;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="mycustomers")
public class Customer {
	@Id
	@Column(name="cid")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cid;
	
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone")
	private String phone;
	
	@OneToMany(mappedBy="customer")
	private Set<Request> requests;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String firstName, String lastName, String email, String phone) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
	}

	public Customer(int cid, String firstName, String lastName, String email, String phone) {
		super();
		this.cid = cid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	

	public Set<Request> getRequests() {
		return requests;
	}

	public void setRequests(Set<Request> requests) {
		this.requests = requests;
	}

	@Override
	public String toString() {
		return cid + "\t" + firstName + "\t" + lastName + "\t" + email + "\t" + phone;
	}

}
