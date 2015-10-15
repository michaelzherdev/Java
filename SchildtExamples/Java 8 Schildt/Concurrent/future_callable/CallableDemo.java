package future_callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(3);
		Future<Integer> f1;
		Future<Double> f2;
		Future<Integer> f3;
		
		f1 = es.submit(new Sum(10));
		f2 = es.submit(new Hypot(3, 4));
		f3 = es.submit(new Factorial(5));
		
		try {
			System.out.println(f1.get());
			System.out.println(f2.get());
			System.out.println(f3.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
		es.shutdown();
		System.out.println("Done!");
	}
}

class Sum implements Callable<Integer>{
	int stop;
	
	Sum(int v) { stop = v;}
	
	@Override
	public Integer call() throws Exception {
		int sum = 0;
		for(int i = 0; i <= stop; i++)
			sum += i;
		return sum;
	}
}

class Hypot implements Callable<Double>{
	double side1, side2;
	
	Hypot(double s1, double s2) {
		side1 = s1;
		side2 = s2;
	}

	@Override
	public Double call() throws Exception {
		return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
	}	
}

class Factorial implements Callable<Integer> {
	int stop;
	
	public Factorial(int v) {
		stop = v;
	}

	@Override
	public Integer call() throws Exception {
		int res = 1;
		for(int i = 2; i <= stop; i++)
			res *= i;
		return res;
	}
	
	
}