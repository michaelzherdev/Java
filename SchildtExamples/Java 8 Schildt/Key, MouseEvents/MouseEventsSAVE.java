package ch24;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/*
 * <applet code="MouseEventsSAVE" width=300 height=100>
 * </applet>
 */

public class MouseEventsSAVE extends Applet implements MouseListener, MouseMotionListener{
	String msg = "";
	int mouseX = 0, mouseY = 0;
	@Override
	public void init() {
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		mouseX = e.getX();
		mouseY = e.getY();
		msg = "*";
		showStatus("Dragging mouse at " + mouseX + ", " + mouseY);
		repaint();
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		showStatus("Moving mouse at " + mouseX + ", " + mouseY);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		mouseX = 0;
		mouseY = 10;
		msg = "Mouse clicked.";
		repaint();
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		mouseX = 0;
		mouseY = 10;
		msg = "Mouse entered.";
		repaint();
	}
	@Override
	public void mouseExited(MouseEvent e) {
		mouseX = 0;
		mouseY = 10;
		msg = "Mouse exited.";
		repaint();
	}
	@Override
	public void mousePressed(MouseEvent e) {
		mouseX = e.getX();
		mouseY = e.getY();
		msg = "Down.";
		repaint();
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		mouseX = e.getX();
		mouseY = e.getY();
		msg = "Up.";
		repaint();
	}
	@Override
	public void paint(Graphics g) {
		g.drawString(msg, mouseX, mouseY);
	}
	
	
}
