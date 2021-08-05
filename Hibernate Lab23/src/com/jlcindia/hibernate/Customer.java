package com.jlcindia.hibernate;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cid")
	private int cid;
	
	@Column(name="name")
	private String name;
	
	@Embedded
	@AttributeOverrides(value={
	@AttributeOverride(name="street",
			column=@Column(name="mystreet")),
	@AttributeOverride(name="city",column=@Column(name="mycity"))
	})
	private Address address;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String name, Address address) {
		this.name = name;
		this.address = address;
	}
	public Customer(int cid, String name, Address address) {
		this.cid = cid;
		this.name = name;
		this.address = address;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
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

	@Override
	public String toString() {
		return  cid + "\t" + name + "\t" + address ;
	}
	
	
}
