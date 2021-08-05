package com.classcore.jlc08;

public class Lab714 {

	public static void main(String[] args) {
		Direction4.EAST.show();
		Direction4.WEST.show();
		Direction4.NORTH.show();
		Direction4.SOUTH.show();
	}

}
enum Direction4{
	EAST(){
		void show(){
			System.out.println("showing East Direction");
		}
	},NORTH(){
		void show(){
			System.out.println("showing North Direction");
		}
	},WEST(){
		void show(){
			System.out.println("showing West Direction");
		}
	},SOUTH(){
		void show(){
			System.out.println("showing South Direction");
		}
	};
	abstract void show();
}