package CyclicBarrier;

import java.util.concurrent.CyclicBarrier;

import countDownLatch.MyThread;

public class BarDemo {
	public static void main(String[] args) {
		CyclicBarrier cb = new CyclicBarrier(3, new BarAction());
		
		System.out.println("Threads start running");
		
		new MeinThread(cb, "A");
		new MeinThread(cb, "B");
		new MeinThread(cb, "C");
		
		new MeinThread(cb, "D");
		new MeinThread(cb, "E");
		new MeinThread(cb, "F");
		
	}
}
