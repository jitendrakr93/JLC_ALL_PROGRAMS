package com.classcore.jlc07;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Lab660 {

	public static void main(String[] args) {
		Queue<String> que = new PriorityQueue<String>();
		que.add("Srinivas");
		que.add("Manish");
		que.offer("Kumar");
		que.offer("Dande");
		que.add("Ranjan");
		int len = que.size();
		for (int i = 0; i < len; i++) {
			System.out.println(que.poll());
		}
		System.out.println("\n*******");
		Queue<String> que1 = new PriorityQueue<String>(10, new PSort());
		que1.add("Srinivas");
		que1.add("Manish");
		que1.offer("Kumar");
		que1.offer("Dande");
		que1.add("Ranjan");
		int len2 = que1.size();
		for (int i = 0; i < len2; i++)
			System.out.println(que1.poll());

	}

}

class PSort implements Comparator<String> {
	@Override
	public int compare(String in1, String in2) {
		return in2.compareTo(in1);
	}
}