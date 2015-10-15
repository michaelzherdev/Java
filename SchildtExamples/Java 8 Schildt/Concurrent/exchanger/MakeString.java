package exchanger;

import java.util.concurrent.Exchanger;

public class MakeString implements Runnable{
	Exchanger<String> ex;
	String str;
	
	
	
	public MakeString(Exchanger<String> ex) {
		this.ex = ex;
		new Thread(this).start();
	}

	@Override
	public void run() {
		for(int i = 0 ; i < 3; i++) {
			try {
				str = ex.exchange(new String());
				System.out.println("Got: " + str);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
