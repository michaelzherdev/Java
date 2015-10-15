package countDownLatch;

import java.util.concurrent.CountDownLatch;

public class CDLDemo {
	public static void main(String[] args) {
		CountDownLatch cdl = new CountDownLatch(5);
		
		System.out.println("Запуск потока исполнения");
		
		new MyThread(cdl);
		
		try {
			cdl.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Завершение потока исполнения");
	}
}
