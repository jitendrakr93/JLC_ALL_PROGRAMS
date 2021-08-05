package com.classcore.jlc08;

public class Lab712 {

	public static void main(String[] args) {
		Direction2 arr[]=Direction2.values();
		for(Direction2 d:arr)
		{
			System.out.println(d.ordinal()+"\t"+d.name());
		}
		try{
			Direction2 d=Direction2.valueOf("east");
			System.out.println("** Direction found with the name");
		}catch(IllegalArgumentException e){
			System.out.println("No Direction Found with the name");
		}
		Direction2 d=Direction2.valueOf("EAST");
		System.out.println(d);

	}

}
enum Direction2{
EAST(0),NORTH(90),WEST(180),SOUTH(270);
	int angle;
	private Direction2(int angle) {
		this.angle=angle;
		System.out.println("Direction()2 Def Cons**");
	}
	static{
		System.out.println("**Static lock in Direction class\n");
	}
}