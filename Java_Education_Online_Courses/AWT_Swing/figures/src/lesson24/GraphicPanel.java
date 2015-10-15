package lesson24;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class GraphicPanel extends JPanel implements Runnable{
	
	private static final long serialVersionUID = 6791889533399961746L;
	
	private Line line;
	private Line line2;
	
	private Rectangle rectangle;
	
	private Circle circle;
	
	public GraphicPanel(){
		line = new Line(300,100, 300, 200);
		line2 = new Line(30, 250, 170, 4);
		rectangle = new Rectangle(170, 200, 75, 100);
		circle = new Circle(250, 250, 100, 100);
		
		(new Thread(this)).start();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		((Graphics2D)g).setComposite(AlphaComposite.getInstance(AlphaComposite.SRC));
		
		g2.draw(line);
	//	g2.draw(line2);
	//	g2.draw(rectangle);
	//	g2.draw(circle);
	}

	@Override
	public void run() {
		while(true){
			try {
				line.movie();
				super.repaint();
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
