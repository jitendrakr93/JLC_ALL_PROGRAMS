package com.classcore.jlc07;

import java.io.IOException;

public class Lab685 {

	public static void main(String[] args) throws Exception{
		JlcReader rd=new JlcReader();
		System.out.println("Enter Sid");
		String sid=rd.readLine();
		System.out.println("Enter Name");
		String nm=rd.readLine();
		System.out.println("Enter Phone");
		String phn=rd.readLine();
		System.out.println("Enter Fee");
		String fee=rd.readLine();
		System.out.println(sid+"\t"+nm+"\t"+phn+"\t"+fee);

	}

}
class JlcReader{
	public String readLine() throws IOException{
		StringBuffer val=new StringBuffer();
		while(true){
			int asc=System.in.read();
			if(asc == 13); //IGNORE 13 ASCII
			else if(asc == 10)
				break; //IGNORE 10 ASCII & BREAK
			else{
				char ch=(char) asc;
				val.append(ch);
			}
		}
		return val.toString();
	}
}