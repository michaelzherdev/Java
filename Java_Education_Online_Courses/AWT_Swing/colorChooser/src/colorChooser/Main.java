package colorChooser;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Frame");
		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new BorderLayout());
		
		final JColorChooser chooser = new JColorChooser();
		
		JPanel panel = new JPanel(new BorderLayout());
		final JLabel label = new JLabel("text text text");
		JButton button = new JButton("button");
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent event) {
				Color c = chooser.getColor();
				label.setForeground(c);
			}
		});
		
		
		
		Color c = chooser.getColor();
		
		panel.add(button, BorderLayout.NORTH);
		panel.add(label, BorderLayout.SOUTH);
		
		frame.add(chooser, BorderLayout.CENTER);
		frame.add(panel, BorderLayout.SOUTH);
		
		frame.setVisible(true);
		frame.pack();
	}
}
