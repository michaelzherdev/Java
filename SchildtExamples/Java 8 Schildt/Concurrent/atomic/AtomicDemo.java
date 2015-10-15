package atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicDemo {
	public static void main(String[] args) {
		new AtomThread("A");
		new AtomThread("B");
		new AtomThread("C");
	}
}

class Shared{
	static AtomicInteger ai = new AtomicInteger(0);
}

class AtomThread implements Runnable{
	String name;

	public AtomThread(String name) {
		this.name = name;
		new Thread(this).start();
	}

	@Override
	public void run() {
		System.out.println("Beginning thread " + name);
		for( int i = 0; i <= 3; i++)
			System.out.println("Thread "+ name + " got " + Shared.ai.getAndSet(i));
	}
	
	
}
