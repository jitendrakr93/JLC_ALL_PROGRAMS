package com.classcore.jlc08;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface JLCCloneable{}

@JLCCloneable
class Emp8{
	int eid;
	String ename;
	public Emp8(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	@Override
	public String toString(){
		return eid+"\t"+ename;
	}
	public Emp8 getClonedObject() throws CloneNotSupportedException{
		boolean b1=this.getClass().isAnnotationPresent(JLCCloneable.class);
		if(b1){
			return new Emp8(this.eid,this.ename);
		}
		throw new CloneNotSupportedException("Emp8 class not using JLCCloneable");
	}
}
public class Lab739 {

	public static void main(String[] args)throws CloneNotSupportedException {
		Emp8 emp=new Emp8(99, "Srinivas");
		System.out.println(emp);
		Emp8 emp2=emp.getClonedObject();
		System.out.println(emp2);
		System.out.println(emp == emp2);
	}

}
