package com.jlcindia.hibernate;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "sid")
	private int sid;

	@Column(name = "sname")
	private String sname;

	@Column(name = "dob")
	private String dob;

	@Column(name = "qualification")
	private String qualification;

	@ElementCollection
	@CollectionTable(name = "courses", joinColumns = @JoinColumn(name = "sid"))
	@OrderColumn(name = "idx")
	@Column(name = "cname")
	private String[] course;

	@ElementCollection
	@CollectionTable(name = "emails", joinColumns = @JoinColumn(name = "sid"))
	@OrderColumn(name = "idx")
	@Column(name = "emailid")
	private List<String> emails;

	@ElementCollection
	@CollectionTable(name = "marks", joinColumns = @JoinColumn(name = "sid"))
	@Column(name = "marks")
	private List<Integer> marks;

	@ElementCollection
	@CollectionTable(name = "phones", joinColumns = @JoinColumn(name = "sid"))
	@Column(name = "phones")
	private Set<Long> phones;

	@ElementCollection
	@CollectionTable(name = "refs", joinColumns = @JoinColumn(name = "sid"))
	@MapKeyColumn(name = "rname")
	@Column(name = "rphone")
	private Map<String, Long> refs;

	public Student() {

	}

	public Student(String sname, String dob, String qualification, String[] course, List<String> emails,
			List<Integer> marks, Set<Long> phones, Map<String, Long> refs) {
		this.sname = sname;
		this.dob = dob;
		this.qualification = qualification;
		this.course = course;
		this.emails = emails;
		this.marks = marks;
		this.phones = phones;
		this.refs = refs;
	}

	public Student(int sid, String sname, String dob, String qualification, String[] course, List<String> emails,
			List<Integer> marks, Set<Long> phones, Map<String, Long> refs) {
		this.sid = sid;
		this.sname = sname;
		this.dob = dob;
		this.qualification = qualification;
		this.course = course;
		this.emails = emails;
		this.marks = marks;
		this.phones = phones;
		this.refs = refs;
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

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String[] getCourse() {
		return course;
	}

	public void setCourse(String[] course) {
		this.course = course;
	}

	public List<String> getEmails() {
		return emails;
	}

	public void setEmails(List<String> emails) {
		this.emails = emails;
	}

	public List<Integer> getMarks() {
		return marks;
	}

	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}

	public Set<Long> getPhones() {
		return phones;
	}

	public void setPhones(Set<Long> phones) {
		this.phones = phones;
	}

	public Map<String, Long> getRefs() {
		return refs;
	}

	public void setRefs(Map<String, Long> refs) {
		this.refs = refs;
	}

}
