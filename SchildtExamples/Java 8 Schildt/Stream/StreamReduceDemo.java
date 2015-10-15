package ch29;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamReduceDemo {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(7);
		list.add(18);
		list.add(10);
		list.add(24);
		list.add(17);
		list.add(5);
		
		Stream<Integer> stream = list.stream();
		int res = stream.reduce(1, (a, b) -> {if(b%2==0) return a*b; else return a;});
		System.out.println(res);
	}
}
