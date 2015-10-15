// Создание нескольких потоков
class MyThread implements Runnable {
	Thread thrd;
	
	// построить новый поток
	MyThread(String name) {
		thrd = new Thread(this, name); // поток переименуется при его создании
		thrd.start(); // начало исполнения потока
	}
	
	// начать исполнение нового потока
	public void run() {
		// Здесь начинают исполняться потоки
		System.out.println(thrd.getName() + " starting.");
		try {
			for(int count = 0; count < 10; count++) {
				Thread.sleep(400);
				System.out.println("In " + thrd.getName() + ", count is " + count);
			}
		} catch(InterruptedException exc) {
			System.out.println(thrd.getName() + " interrupted.");
		} System.out.println(thrd.getName() + " terminating.");
	}
}

public class MoreThreads {
	public static void main(String[] args) {
		System.out.println("Main thread starting");
		
		// Теперь поток начинает строится при его создании
		MyThread mt1 = new MyThread("Child #1");
		MyThread mt2 = new MyThread("Child #2");
		MyThread mt3 = new MyThread("Child #3");
		
		for(int i=0; i<50; i++) {
			System.out.print(".");
			try {
				Thread.sleep(100);
			} catch(InterruptedException exc) {
				System.out.println("Main thread interrupted.");
			}
		}
		System.out.println("Main thread ending.");
	}
}
