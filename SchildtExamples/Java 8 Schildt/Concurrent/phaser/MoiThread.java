package phaser;

import java.util.concurrent.Phaser;

public class MoiThread implements Runnable{
	Phaser phsr;
	String name;
	
	
	
	public MoiThread(Phaser p, String n) {
		this.phsr = p;
		this.name = n;
		phsr.register();
		new Thread(this).start();
	}



	@Override
	public void run() {
		System.out.println("Thread " + name + " begins first phase");
		phsr.arriveAndAwaitAdvance();
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Thread " + name + " begins second phase");
		phsr.arriveAndAwaitAdvance();
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Thread " + name + " begins third phase");
		phsr.arriveAndDeregister();
	}
	
	

}
