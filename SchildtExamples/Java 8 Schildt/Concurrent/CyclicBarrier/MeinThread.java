package CyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class MeinThread implements Runnable{
	CyclicBarrier cb;
	String name;
	
	
	
	public MeinThread(CyclicBarrier cb, String name) {
		this.cb = cb;
		this.name = name;
		new Thread(this).start();
	}



	@Override
	public void run() {
		System.out.println(name);
		try {
			cb.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}
	}

	
}
