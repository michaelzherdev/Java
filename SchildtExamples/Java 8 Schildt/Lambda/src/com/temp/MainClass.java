package com.temp;

import java.io.IOException;
import java.util.function.Function;

public class MainClass {

	static <T> int counter(T[] vals, MyFunc<T> f, T v){
		int count = 0;
		for(int i = 0; i < vals.length; i++)
			if(f.func(vals[i], v))
				count++;
		return count;
	}
	
	public static void main(String[] args) {
		int count;
		
		HighTemp[] weekDayHigh = {new HighTemp(33), new HighTemp(23),
				new HighTemp(27), new HighTemp(26), new HighTemp(28),
		new HighTemp(19), new HighTemp(27)};
		
		count = counter(weekDayHigh, HighTemp::sameTemp, new HighTemp(27)); 
		System.out.println(count);
		
		count = counter(weekDayHigh, HighTemp::lessThanTemp, new HighTemp(26));
		System.out.println(count);
		
		Function<Integer, Integer> factorial = n -> {
			int result = 1;
			for(int i = 1 ; i <= n; i++)
				result *= i;
			return result;
		};
		System.out.println(factorial.apply(3));
		
		System.out.println(System.getProperty("java.io.tmpdir"));
		System.out.println(System.getProperty("user.home"));
		
	}
}
