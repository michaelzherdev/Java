package semaphore;

import java.util.concurrent.Semaphore;

public class DecThread implements Runnable{
	String name;
	Semaphore sem;
	public DecThread(String name, Semaphore sem) {
		this.name = name;
		this.sem = sem;
		new Thread(this).start();
	}
	@Override
	public void run() {
		System.out.println("Thread " + name);
		try{
			System.out.println("Thread " + name + " waiting for allowing");
			sem.acquire();
			System.out.println("Thread " + name + " get allowing");
			
			for(int i = 0; i < 5; i++){
				Shared.count--;
				System.out.println(name + ":" + Shared.count);
				
				Thread.sleep(10);
			}
		} catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("Thread " + name + " free pool");
		sem.release();
	}
}
