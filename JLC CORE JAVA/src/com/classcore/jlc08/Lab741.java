package com.classcore.jlc08;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Column{
	String name();
	boolean charType() default false;
}
class Faculty{
	@Column(name="facultyId",charType=true)
	int id;
	@Column(name="facultyName")
	String name;
	long phone;
}
public class Lab741 {

	public static void main(String[] args) {
		Faculty f1=new Faculty();
		Class cl=f1.getClass();
		Field[] flds=cl.getDeclaredFields();
		for(Field fld:flds){
			boolean pre=fld.isAnnotationPresent(Column.class);
			if(pre){
				Column col=(Column)fld.getAnnotation(Column.class);
				String cnm=col.name();
				boolean cty=col.charType();
				System.out.println(fld.getName()+"\t"+cnm+"\t"+cty);
				
			}else{
				System.out.println("For "+fld.getName()+"Column annotation is not present");
			}
		}

	}

}
