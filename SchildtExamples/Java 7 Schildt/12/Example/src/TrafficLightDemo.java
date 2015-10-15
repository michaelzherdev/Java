// Перечисление, представляющее состояния светофора
enum TrafficLightColor {
	RED, GREEN, YELLOW
	}

// имитация автоматизированного светофора
class TrafficLightSimulator implements Runnable {
	private Thread thrd; // поток для имитации светофора
	private TrafficLightColor tlc; // текущий свет светофора
	boolean stop = false; // остановка имитации, если истинно
	boolean changed = false; // переключение светофора, если истинно
	
	TrafficLightSimulator(TrafficLightColor init) {
		tlc = init;
		thrd = new Thread(this);
		thrd.start();
	}
	
	TrafficLightSimulator() {
		tlc = TrafficLightColor.RED;
		thrd = new Thread(this);
		thrd.start();
	}
	
	// запуск имитации автоматизированного светофора
	public void run() {
		while(!stop) {
			try {
				switch(tlc) {
				case GREEN:
					Thread.sleep(10000); // зеленый на 10 секунд
					break;
				case YELLOW:
					Thread.sleep(2000); // желтый на 2 секунды
					break;
				case RED:
					Thread.sleep(12000); // красный на 12 секунд
					break;
				}
			} catch(InterruptedException exc) {
				System.out.println(exc);
			}
			changeColor();
		}
	}
	// переключение цвета светофора
	synchronized void changeColor() {
		switch(tlc) {
			case RED:
				tlc = TrafficLightColor.GREEN; break;
			case YELLOW:
				tlc = TrafficLightColor.RED; break;
			case GREEN:
				tlc = TrafficLightColor.YELLOW; break;
			}
				
			changed = true;
			notify(); // уведомить о переключении цвета светофора
		}
	
	// ожидание переключения цвета светофора
	synchronized void waitForChange() {
		try {
			while(!changed)
				wait(); // ожидать переключения цвета светофора
			changed = false;
	} catch(InterruptedException exc) {
		System.out.println(exc);
	}
}
	// возврат текущего света
	TrafficLightColor getColor() {
		return tlc;
	}
	
	// прекращение имитации светофора
	void cancel() {
		stop = true;
	}
}

public class TrafficLightDemo {
	public static void main(String[] args) {
		TrafficLightSimulator t1 =
				new TrafficLightSimulator(TrafficLightColor.GREEN);
		
		for(int i=0; i<9; i++) {
			System.out.println(t1.getColor());
			t1.waitForChange();
		}
		
		t1.cancel();
	}
}
