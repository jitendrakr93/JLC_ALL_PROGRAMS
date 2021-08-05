package com.jlcindia.hibernate;

import java.util.Set;

public class Student {
	private int sid;
	private String sname;
	private String email;
	private long phone;
	private Set<Course> courses;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String sname, String email, long phone) {
		this.sname = sname;
		this.email = email;
		this.phone = phone;
	}

	public Student(int sid, String sname, String email, long phone) {
		this.sid = sid;
		this.sname = sname;
		this.email = email;
		this.phone = phone;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
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

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return sid + "\t" + sname + "\t" + email + "\t" + phone;
	}

}
