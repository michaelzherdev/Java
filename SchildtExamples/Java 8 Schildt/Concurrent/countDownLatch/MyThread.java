package countDownLatch;

import java.util.concurrent.CountDownLatch;

public class MyThread implements Runnable{
	CountDownLatch cdl;
	
	MyThread(CountDownLatch cdl) {
		this.cdl = cdl;
		new Thread(this).start();
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 5; i++){
			System.out.println(i);
			cdl.countDown();
		}
	}

	
}
