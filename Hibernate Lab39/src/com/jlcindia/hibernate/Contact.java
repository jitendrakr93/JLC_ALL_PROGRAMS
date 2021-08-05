package com.jlcindia.hibernate;

public class Contact {
	private int contactId;
	private String firstName;
	private String lastName;
	private String email;
	private long phone;
	private String dob;
	private String status;

	public Contact() {
		// TODO Auto-generated constructor stub
	}

	public Contact(String firstName, String lastName, String email, long phone, String dob, String status) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.dob = dob;
		this.status = status;
	}

	public Contact(int contactId, String firstName, String lastName, String email, long phone, String dob,
			String status) {
		this.contactId = contactId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.dob = dob;
		this.status = status;
	}
	
	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
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

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return contactId + "\t" + firstName + "\t" + lastName + "\t" + email + "\t" + phone + "\t" + dob + "\t"
				+ status;
	}

}
