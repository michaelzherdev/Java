package semaphore;

import java.util.concurrent.Semaphore;

public class SemaphorDemo {
	public static void main(String[] args) {
		Semaphore sem = new Semaphore(1);
		
		new IncThread("A", sem);
		new DecThread("B", sem);
	}
}

class Shared {
	static int count = 0;
}