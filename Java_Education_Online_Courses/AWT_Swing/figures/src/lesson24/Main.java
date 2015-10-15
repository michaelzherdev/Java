package lesson24;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(600, 400);
		frame.setTitle("this is title form");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new GridBagLayout());
		
		GraphicPanel graphicPanel = new GraphicPanel();
		
		frame.add(graphicPanel, new GridBagConstraints(0, 0, 1, 1, 1, 1,
				GridBagConstraints.NORTH, GridBagConstraints.BOTH,
				new Insets(2, 2, 2, 2), 0, 0));
		
		frame.setVisible(true);
	}

}
