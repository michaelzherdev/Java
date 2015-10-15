package ch24;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


/*
 * <applet code="KeyEventsSAVE" width=300 height=100>
 * </applet>
 */
public class KeyEventsSAVE extends Applet implements KeyListener{

	String msg = "";
	int X = 10, Y = 20;
	
	
	
	@Override
	public void init() {
		addKeyListener(this);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		showStatus("Key down");
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
