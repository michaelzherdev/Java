package gridLayout;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main {

		public static void main(String[] args) {
			JFrame frame = new JFrame();
			
			frame.setSize(250, 150);
			frame.setTitle("this is title form");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setLocationRelativeTo(null);
			frame.setLayout(new BorderLayout());
			
			JPanel panel = new JPanel(new GridLayout(3, 3));
			JPanel panelNorth = new JPanel(new BorderLayout());
			
			JButton button0 = new JButton();
			JButton button1 = new JButton();
			JButton button2 = new JButton();
			JButton button3 = new JButton();
			JButton button4 = new JButton();
			JButton button5 = new JButton();
			JButton button6 = new JButton();
			JButton button7 = new JButton();
			JButton button8 = new JButton();
			JButton button9 = new JButton();
			
			JTextField field = new JTextField(10);
			
			panel.add(button0);
			panel.add(button1);
			panel.add(button2);
			panel.add(button3);
			panel.add(button4);
			panel.add(button5);
			panel.add(button6);
			panel.add(button7);
			panel.add(button8);
			panel.add(button9);
			
			panelNorth.add(field, BorderLayout.CENTER);
			
			frame.add(panelNorth, BorderLayout.NORTH);
			frame.add(panel, BorderLayout.CENTER);
			
			frame.setVisible(true);
		}
}
