// ���������� ������� wail � notify ��� �������� �����
class ThreadCom {
	String state; // �������� �������� � ��������� �����
	
	synchronized void tick(boolean running) {
		if(!running) { // ���������� ����
			state = "ticked";
			notify(); // ��������� ��������� ������
			return;
		}
		System.out.print("Tick ");
		
		state = "ticked"; // ���������� ������� ��������� ����� ����� "���"
		notify(); // ����� tick ���������� tock � ����������� ���������� ����������
		
		try{
			while(!state.equals("tocked"))
				wait(); // ����� tick ������� ���������� ������ tock
		} catch(InterruptedException exc) {
			System.out.println("Thread interrupted.");
		}
	}
	
	synchronized void tock(boolean running) {
		if(!running) { // ���������� ����
			state = "tocked";
			notify(); // ��������� ��������� ������
			return;
		}
		System.out.println("Tock ");
		state = "tocked"; // ���������� ������� ��������� ����� ����� "���"
		notify(); // ����� tock ���������� tick � ����������� ���������� ����������
		
		try{
			while(!state.equals("ticked"))
				wait(); // ����� tock ������� ���������� ������ tick
		} catch(InterruptedException exc) {
			System.out.println("Thread interrupted.");
		}
	}
}

class MyThread implements Runnable {
	Thread thrd;
	ThreadCom ttOb;
	
	// ��������� ����� �����
	MyThread(String name, ThreadCom tt) {
		thrd = new Thread(this, name);
		ttOb = tt;
		thrd.start(); // ������ �����
	}
	
	// ������ ���������� ������ ������
	public void run() {
		if(thrd.getName().compareTo("Tick") == 0) {
				for(int i=0; i<5; i++) ttOb.tick(true);
				ttOb.tick(false);
		} else {
			for(int i=0; i<5; i++) ttOb.tock(true);
			ttOb.tock(false);
		}
	}
}

public class TickTack {
	public static void main(String[] args) {
		ThreadCom tt = new ThreadCom();
		MyThread mt1 = new MyThread("Tick", tt);
		MyThread mt2 = new MyThread("Tock", tt);
		
		try {
			mt1.thrd.join();
			mt2.thrd.join();
		} catch(InterruptedException exc) {
			System.out.println("Main thread interrupted.");
		}
	}
}
