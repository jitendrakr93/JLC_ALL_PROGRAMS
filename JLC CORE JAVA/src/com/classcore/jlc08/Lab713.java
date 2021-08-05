package com.classcore.jlc08;

public class Lab713 {

	public static void main(String[] args) {
		Direction3 d=Direction3.EAST;
		switch(d){
		case EAST:
			System.out.println("EAST Direction is selected");
			break;
		case NORTH:
			System.out.println("NORTH Direction is selected");
			break;
		case WEST:
			System.out.println("WEST Direction is selected");
			break;
		case SOUTH:
			System.out.println("SOUTH Direction is selected");
			break;
			
		}

	}

}
enum Direction3{
	EAST,NORTH,WEST,SOUTH
}