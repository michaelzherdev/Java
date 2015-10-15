// Апплет, отражающий текущее время
import java.util.*;
import java.awt.*;
import java.applet.*;

/*
 * <object code="Clock" width=200 height=50>
 * </object>
 */

public class Clock extends Applet implements Runnable {
	String msg;
	Thread t;
	Calendar clock;
	boolean stopFlag;
	
	public void init() {
		t = null;
		msg = "";
	}
	
	public void start() {
		t = new Thread(this);
		stopFlag = false;
		t.start();
	}
	
	public void run() {
		// отобразить время повторно
		for(;;) {
			try {
				repaint();
				Thread.sleep(1000);
				if(stopFlag) break;
			} catch(InterruptedException exc) {}
		}
	}
	
	public void stop() {
		stopFlag = true;
		t = null;
	}
	
	// отобразить время
	public void paint(Graphics g) {
		clock = Calendar.getInstance();
		
		msg = "Current time is "
				+ Integer.toString(clock.get(Calendar.HOUR));
		msg = msg + ": "
				+ Integer.toString(clock.get(Calendar.MINUTE));
		msg = msg + ": "
				+ Integer.toString(clock.get(Calendar.SECOND));
		g.drawString(msg, 30, 30);
	}
}