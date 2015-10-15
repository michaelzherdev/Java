package radioButton;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Main {
	public static void main(String[] args) {
	JFrame frame = new JFrame();
	frame.setSize(600, 400);
	frame.setTitle("this is title form");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLocationRelativeTo(null);
	frame.setLayout(new BorderLayout());
	
	final JRadioButton radioButton = new JRadioButton("Radio button");
	frame.add(radioButton, BorderLayout.NORTH);
	
	JCheckBox checkBox = new JCheckBox("Check box");
	frame.add(checkBox, BorderLayout.SOUTH);
	
	JButton button = new JButton("Button");
	button.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
		//	boolean selected = radioButton.isSelected();
		//	System.out.println("selected = " + selected);
			radioButton.setText("RADIO BUTTON");
		}
	});
	frame.add(button);
	
	frame.setVisible(true);
	frame.pack();
}
}
