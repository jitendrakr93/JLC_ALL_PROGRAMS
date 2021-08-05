package com.jlcindia.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mycustomer")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cid")
	private int cid;
	
	@Column(name="cname")
	private String cname;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone")
	private long phone;
	
	@Column(name="city")
	private String city;
	
	@Column(name="bal")
	private double bal;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String cname, String email, long phone, String city, double bal) {
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		this.city = city;
		this.bal = bal;
	}

	public Customer(int cid, String cname, String email, long phone, String city, double bal) {
		this.cid = cid;
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		this.city = city;
		this.bal = bal;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

	@Override
	public String toString() {
		return  cid + "\t" + cname + "\t" + email + "\t" + phone + "\t" + city+ "\t" + bal ;
	}
	 

}
