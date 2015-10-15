/* ќтслеживание перемещени€ мыши путем рисовани€ линии.
 * ѕризнаком начала и конца линии €вл€ютс€ нажатие 
 * и отпускание кнопки мыши
 */
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
 * <applet code="TrackM" width=300 height=100>
 * </applet>
 */

public class TrackM extends Applet
 implements MouseListener, MouseMotionListener{
	int curX = 0, curY = 0;
	int oldX = 0, oldY = 0;
	boolean draw;
	
	public void init() {
		addMouseListener(this);
		addMouseMotionListener(this);
		draw = false;
	}
	/* следующие 3 метода не используютс€, но их пустые реализации
	 * нужны, т.к. они объ€влены в интерфейсе MouseListener
	 * 
	 */
	public void mouseEntered(MouseEvent me) {}
	public void mouseExited(MouseEvent me) {}
	public void mouseClicked(MouseEvent me) {}
	
	public void mousePressed(MouseEvent me) {
		oldX = me.getX();
		oldY = me.getY();
		draw = true;
	}
		
	public void mouseReleased(MouseEvent me) {
		draw = false;
		}
	
	public void mouseDragged(MouseEvent me) {
		curX = me.getX();
		curY = me.getY();
		repaint();
		}
	
	public void mouseMoved(MouseEvent me) {
		showStatus("Moving mouse at " + me.getX() + ", " + me.getY());
					}
	
	public void paint(Graphics g) {
		if(draw)
			g.drawLine(oldX, oldY, curX, curY);
	}
}