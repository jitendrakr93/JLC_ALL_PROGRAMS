package com.classcore.jlc07;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Lab652 {

	public static void main(String[] args) {
		ArrayList<String> emails = new ArrayList<String>();
		emails.add("sri@jlc.com");
		emails.add("dk@jlc.com");
		emails.add("mk@jlc.com");
		ArrayList<Long> phones = new ArrayList<Long>();
		phones.add(555555L);
		phones.add(666666L);
		phones.add(777777L);
		LinkedHashMap<String, Long> refs = new LinkedHashMap<String, Long>();
		refs.put("Dande", 111111L);
		refs.put("Kumar", 222222L);
		refs.put("Ranjan", 333333L);
		Student5 stu = new Student5(99, "Srinivas", emails, phones, refs);
		ArrayList<Student5> stList = new ArrayList<Student5>();
		stList.add(stu);
		stList.add(stu);
		stList.add(stu);
		stList.add(stu);
		System.out.println(stList);
	}

}

class Student5 {
	int sid;
	String name;
	List<String> emails;
	List<Long> phones;
	Map<String, Long> refs;

	public Student5(int sid, String name, List<String> emails, List<Long> phones, Map<String, Long> refs) {
		super();
		this.sid = sid;
		this.name = name;
		this.emails = emails;
		this.phones = phones;
		this.refs = refs;
	}

	@Override
	public String toString() {
		return "\n" + sid + "\t" + name + "\n" + emails + "\n" + phones + "\n" + refs + "\n";
	}
}