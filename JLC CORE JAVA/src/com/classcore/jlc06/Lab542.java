package com.classcore.jlc06;

public class Lab542 {

	public static void main(String[] args) throws CloneNotSupportedException{
		Student9 st=new Student9(99);
		System.out.println(st.sid);
		Student9 st2=st.myclone();
		System.out.println(st2.sid);
		System.out.println(st==st2);
	}

}

interface JLCCloneable {
}

class Student9 implements JLCCloneable {
	int sid;

	public Student9(int sid) {
		this.sid=sid;
	}
	public Student9 myclone()throws CloneNotSupportedException{
		if(this instanceof JLCCloneable)
			return new Student9(sid);
		else
			throw new CloneNotSupportedException("Implement JLCCloneable");
	}
}