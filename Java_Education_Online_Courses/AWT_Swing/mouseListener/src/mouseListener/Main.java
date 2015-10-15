package mouseListener;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(600, 400);
		frame.setTitle("this is title form");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new BorderLayout());

		
		final JLabel label = new JLabel("the label");
		frame.add(label);
		
		
		frame.setVisible(true);
		label.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("mouseReleased");
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				label.setForeground(Color.green);
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("mouseExited");
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("mouseEntered");
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				label.setForeground(Color.red);
				
			}
		});
		frame.pack();
	}

}
