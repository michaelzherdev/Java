// применение ключ. слова synchronize для управления доступом
class SumArray {
	private int sum;
	
	// Метод sumArray синхронизирован
	synchronized int sumArray(int nums[]) {
		sum = 0; // Обнулить сумму
		for(int i=0; i<nums.length; i++) {
			sum += nums[i];
			System.out.println("Running total for "
					+ Thread.currentThread().getName() + " is " + sum);
			try {
				Thread.sleep(10); // разрешить переключение задач
			} catch(InterruptedException exc) {
				System.out.println("Main thread interrupted.");
			}
		} return sum;
	}
}

class MyThread implements Runnable {
	Thread thrd;
	static SumArray sa = new SumArray();
	int a[];
	int answer;
	
	// построить новый поток
	MyThread(String name, int nums[]) {
		thrd = new Thread(this, name);
		a = nums;
		thrd.start(); // начать поток
	}
	
	// начать исполнение нового потока
	public void run() {
		int sum;
		
		System.out.println(thrd.getName() + " starting.");
		
		answer = sa.sumArray(a);
		System.out.println("Sum for " + 
		     thrd.getName() + " is " + answer);
		System.out.println(thrd.getName() + " terminating.");
	}
}

public class Sync {
	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4, 5};
		
		MyThread mt1 = new MyThread("Child #1", a);
		MyThread mt2 = new MyThread("Child #2", a);
	}
}
