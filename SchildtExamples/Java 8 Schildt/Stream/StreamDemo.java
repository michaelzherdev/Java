package ch29;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(7);
		list.add(18);
		list.add(10);
		list.add(24);
		list.add(17);
		list.add(5);
		
		System.out.println("List: " + list);
		
		Stream<Integer> stream = list.stream();
		
		Optional<Integer> min = stream.min(Integer::compare);
		if(min.isPresent())
			System.out.println("Min is " + min.get());
		
		stream = list.stream();
		Optional<Integer> max = stream.max(Integer::compare);
		if(max.isPresent())
			System.out.println("Max is " + max.get());
		
		Stream<Integer> sortedStream = list.stream().sorted();
			System.out.println("Sorted stream: " + sortedStream);
		sortedStream.forEach((n) -> System.out.print(n + " "));
		System.out.println();
		
		Stream<Integer> oddVals = list.stream().filter((n) -> (n%2)==1).filter((n) -> n > 5);
		oddVals.forEach((n) -> System.out.print(n + " "));
		System.out.println();
	}
}
