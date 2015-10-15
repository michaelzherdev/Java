// Апплет с итн функциональными возможностями
import java.awt.*;
import java.applet.*;

/*
 * <applet code="SimpleApplet" width=200 height=60>
 * </applet>
 */
public class SimpleApplet extends Applet {
	public void paint(Graphics g) {
		// вывод символьной строки в окне апплета
		g.drawString("Java makes applets easy", 20, 20);
	}

}
