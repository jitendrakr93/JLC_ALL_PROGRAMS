package com.classcore.jlc08;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Table{
	String value();
}
@Table("stud_table")
class Stud{}
public class Lab740 {

	public static void main(String[] args) {
		Stud st=new Stud();
		Class cl=st.getClass();
		boolean pre=cl.isAnnotationPresent(Table.class);
		if(pre){
			Table tb=(Table) cl.getAnnotation(Table.class);
			String tnm=tb.value();
			System.out.println("Table Name :"+tnm);
		}
		else
		{
			System.out.println("Table Annotation is not present");
		}

	}

}
