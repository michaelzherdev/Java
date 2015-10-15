package ch24;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


/*
 * <applet code="KeyEventsArrowsSAVE" width=300 height=100>
 * </applet>
 */
public class KeyEventsArrowsSAVE extends Applet implements KeyListener{

	String msg = "";
	int X = 10, Y = 20;
	
	@Override
	public void init() {
		addKeyListener(this);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		showStatus("Key down");
		int key = e.getKeyCode();
		
		switch(key) {
		case KeyEvent.VK_F1:
			msg +="<F1>";
			break;
		case KeyEvent.VK_PAGE_DOWN:
			msg +="<PAGE_DOWN>";
			break;
		case KeyEvent.VK_PAGE_UP:
			msg +="<PAGE_UP>";
			break;
		case KeyEvent.VK_LEFT:
			msg +="<LEFT>";
			break;
		case KeyEvent.VK_RIGHT:
			msg +="<RIGHT>";
			break;
		}
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		showStatus("Key up");
	}

	@Override
	public void keyTyped(KeyEvent e) {
		msg += e.getKeyChar();
		repaint();
	}

	@Override
	public void paint(Graphics g) {
		g.drawString(msg, X, Y);
	}

}
