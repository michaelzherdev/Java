package jlist;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Frame");
		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new FlowLayout());
		
		String[] str = {"111", "222", "333", "444", "555"};
		JList list = new JList(str);
		JScrollPane scrollPane = new JScrollPane(list);
		scrollPane.setPreferredSize(new Dimension(300, 200));
		list.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		
		frame.add(list);

		frame.setVisible(true);
		frame.pack();
	}

}
