// Демонстрация обработки событий от мыши
import java.awt.Graphics;
import java.awt.event.*;
import java.applet.*;

/*
 * <applet code="MouseEvents" width=300 height=100>
 * </applet>
 */

public class MouseEvents extends Applet 
	implements MouseListener, MouseMotionListener {
	String msg = "";
	int mouseX = 0, mouseY = 0;
	
	public void init() {
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	
	// обработать событие, наступающее по щелчку кнопки мыши
	public void mouseClicked(MouseEvent me) {
		mouseX = 0;
		mouseY = 10;
		msg = "Mouse clicked";
		repaint();
	}
	
	// обработать событие, наступающее при наведении курсора
	// мыши на компонент польз. интерфейса
		public void mouseEntered(MouseEvent me) {
			mouseX = 0;
			mouseY = 10;
			msg = "Mouse entered";
			repaint();
		}
		
	// обработать событие, наступающее при отведении курсора
	// мыши от компонента польз. интерфейса
		public void mouseExited(MouseEvent me) {
			mouseX = 0;
			mouseY = 10;
			msg = "Mouse exited";
			repaint();
		}

	// обработать событие, наступающее при нажатии кнопки мыши
		public void mousePressed(MouseEvent me) {
			mouseX = me.getX();
			mouseY = me.getY();
			msg = "Down";
			repaint();
		}
		
	// обработать событие, наступающее при отжатии кнопки мыши
		public void mouseReleased(MouseEvent me) {
			mouseX = me.getX();
			mouseY = me.getY();
			msg = "Up";
			repaint();
			}
			
	// обработать событие, наступающее при перетаскивании курсора мыши
		public void mouseDragged(MouseEvent me) {
			mouseX = me.getX();
			mouseY = me.getY();
			msg = "*";
			showStatus("Dragging mouse at " + mouseX + ", " + mouseY);
			repaint();
			}
			
	// обработать событие, наступающее при отжатии кнопки мыши
		public void mouseMoved(MouseEvent me) {
			showStatus("Moving mouse at " + me.getX() + ", " + me.getY());
						}
		
		public void paint(Graphics g) {
		g.drawString(msg, mouseX, mouseY);
	}
}