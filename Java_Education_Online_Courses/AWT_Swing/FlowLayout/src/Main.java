import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		frame.setSize(600, 400);
		frame.setTitle("this is title form");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new FlowLayout());
		
		JPanel panel = new JPanel(new FlowLayout());
		panel.setBackground(Color.green);
		
		JButton button = new JButton("Button");
		JTextField field = new JTextField(10);
		
		panel.add(button);
		panel.add(field);
		panel.setPreferredSize(new Dimension(600,100));
		
		JButton []buttons = new JButton[100];
		for(int i = 0; i<buttons.length; i++) {
			buttons[i] = new JButton(String.valueOf(i));
			frame.add(buttons[i]);
		}
		
		frame.setVisible(true);
	}

}
