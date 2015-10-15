import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		frame.setSize(600, 400);
		frame.setTitle("this is title form");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new BorderLayout());
		
		
		JButton button = new JButton("Button");
		
		frame.add(button, BorderLayout.PAGE_START); // кнопка вверху
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		
		panel1.setBackground(Color.YELLOW);
		panel2.setBackground(Color.BLUE);
		panel3.setBackground(Color.GREEN);
		panel4.setBackground(Color.RED);
		panel5.setBackground(Color.GRAY);
		
		frame.add(panel1, BorderLayout.PAGE_START); // NORTH
		frame.add(panel2, BorderLayout.PAGE_END); // SOUTH
		frame.add(panel3, BorderLayout.LINE_END);// WEST
		frame.add(panel4, BorderLayout.LINE_START); // EAST
		frame.add(panel5, BorderLayout.CENTER); 
		
		panel5.setLayout(new BorderLayout());
		panel5.add(button, BorderLayout.NORTH);
		
		frame.setVisible(true);
	}

}
