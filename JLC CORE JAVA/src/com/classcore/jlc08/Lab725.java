package com.classcore.jlc08;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Lab725 {

	public static void main(String[] args) {
		try{
			Class cl=Class.forName("JlcStudent");
			System.out.println("PUBL :"+Modifier.PUBLIC);
			System.out.println("PRIV :"+Modifier.PRIVATE);
			System.out.println("PROT :"+Modifier.PROTECTED);
			System.out.println("FINA :"+Modifier.FINAL);
			System.out.println("STAT :"+Modifier.STATIC);
			System.out.println("NATI :"+Modifier.NATIVE);
			System.out.println("ABST :"+Modifier.ABSTRACT);
			System.out.println("SYNC :"+Modifier.SYNCHRONIZED);
			Method ms[]=cl.getDeclaredMethods();
			for (int i = 0; i < ms.length; i++) {
				Method m=ms[i];
				System.out.println("\n****** "+m);
				int mod=m.getModifiers();
				System.out.println("Modifiers :"+mod);
				String str=Modifier.toString(mod);
				System.out.println("STR :"+str);
				System.out.println("PUBLIC :"+Modifier.isPublic(mod));
				System.out.println("PRIVATE :"+Modifier.isPrivate(mod));
				System.out.println("PROTECTED :"+Modifier.isProtected(mod));
				System.out.println("FINAL :"+Modifier.isFinal(mod));
				System.out.println("STATIC :"+Modifier.isStatic(mod));
				System.out.println("NATIVE :"+Modifier.isNative(mod));
				System.out.println("ABSTRACT :"+Modifier.isAbstract(mod));
				System.out.println("SYNCHRONIZED :"+Modifier.isSynchronized(mod));
			}
			
		}catch(Exception e){
			System.out.println("JlcStudent class not found");
			e.printStackTrace();
		}
	}

}
abstract class JlcStudent{
	public void m1(){}
	native final void m2();
	public synchronized void m3(){}
	protected abstract void m4();
	private static final void m5(){}
	void m6(){}
}