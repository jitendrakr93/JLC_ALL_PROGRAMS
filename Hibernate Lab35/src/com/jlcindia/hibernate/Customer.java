package com.jlcindia.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries({
	@NamedQuery(name="AllCustomers",query="from Customer"),
	@NamedQuery(name="CustomersByCity",query="from Customer cust where cust.city=?"),
	@NamedQuery(name="CustomersByEmail",query="from Customer cust where cust.email=?"),
	@NamedQuery(name="CustomersByCityAndStatus",query="from Customer cust where cust.city=? and cust.status=?")
})
@Entity
@Table(name="customers")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cid;
	private String cname;
	private String email;
	private String city;
	private String cardBal;
	private String cardType;
	private int cardNo;
	private String status;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String cname, String email, String city, String cardBal, String cardType, int cardNo,
			String status) {
		this.cname = cname;
		this.email = email;
		this.city = city;
		this.cardBal = cardBal;
		this.cardType = cardType;
		this.cardNo = cardNo;
		this.status = status;
	}

	public Customer(int cid, String cname, String email, String city, String cardBal, String cardType, int cardNo,
			String status) {
		this.cid = cid;
		this.cname = cname;
		this.email = email;
		this.city = city;
		this.cardBal = cardBal;
		this.cardType = cardType;
		this.cardNo = cardNo;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCardBal() {
		return cardBal;
	}

	public void setCardBal(String cardBal) {
		this.cardBal = cardBal;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public int getCardNo() {
		return cardNo;
	}

	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return cid + "\t" + cname + "\t" + email + "\t" + city + "\t" + cardBal + "\t" + cardType + "\t" + cardNo + "\t"
				+ status;
	}

}
