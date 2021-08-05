package com.classcore.jlc08;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

public class Lab715 {

	public static void main(String[] args) {
		Set<Direction5> set=EnumSet.allOf(Direction5.class);
		System.out.println(set);
		Map<Direction5, Integer> map=new EnumMap<Direction5,Integer>(Direction5.class);
		map.put(Direction5.EAST, 0);
		map.put(Direction5.NORTH, 90);
		map.put(Direction5.WEST, 180);
		map.put(Direction5.SOUTH, 270);
		System.out.println(map);
	}

}
enum Direction5{
	EAST,NORTH,WEST,SOUTH
}