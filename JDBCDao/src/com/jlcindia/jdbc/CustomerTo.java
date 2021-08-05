package com.jlcindia.jdbc;

public class CustomerTo {
	private int cid;
	private String cname;
	private String email;
	private String phone;
	private String city;
	private double bal;
	private String status;

	public CustomerTo() {
	}

	public CustomerTo(int cid, String cname, String email, String phone, String city, double bal, String status) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		this.city = city;
		this.bal = bal;
		this.status = status;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return cid + "\t" + cname + "\t" + email + "\t" + phone + "\t" + city + "\t" + bal + "\t" + status;
	}
}
