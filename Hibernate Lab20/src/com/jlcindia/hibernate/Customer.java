package com.jlcindia.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="customers")
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
	
	@Version
	private int version;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String cname, String email, long phone) {
		this.cname = cname;
		this.email = email;
		this.phone = phone;
	}

	public Customer(int cid, String cname, String email, long phone) {
		this.cid = cid;
		this.cname = cname;
		this.email = email;
		this.phone = phone;
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

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return cid + "\t" + cname + "\t" + email + "\t" + phone + "\t" + version;
	}

}
