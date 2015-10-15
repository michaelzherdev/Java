// —оздание потока путем реализации интерфейса Runnable
// ¬идоизменение класса MyThread
class MyThread implements Runnable {
	Thread thrd; // в этой переменной хранитс€ ссылка на поток
	
	// построить новый поток
	MyThread(String name) {
		thrd = new Thread(this, name); // поток переименуетс€ при его создании
		thrd.start(); // ачало исполнени€ потока
	}
	
	// начать исполнение нового потока
	public void run() {
		// «десь начинают исполн€тьс€ потоки
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

public class UseThreads2 {
	public static void main(String[] args) {
		System.out.println("Main thread starting");
		
		// “еперь поток начинает строитс€ при его создании
		MyThread mt = new MyThread("Child #1;");
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
