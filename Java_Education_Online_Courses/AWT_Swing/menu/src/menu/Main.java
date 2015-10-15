package menu;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(600, 400);
		frame.setTitle("this is title form");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new BorderLayout());
		
		JMenuBar menuBar = new JMenuBar();
		JMenu menu1 = new JMenu("File");
		JMenu menu2 = new JMenu("Edit");
		JMenu menu3 = new JMenu("Search");
		JMenu menu4 = new JMenu("Help");
		
		JMenuItem menuItem1 = new JMenuItem("Create");
		JMenuItem menuItem2 = new JMenuItem("Open");
		JMenuItem menuItem3 = new JMenuItem("Save");
		JMenuItem menuItem4 = new JMenuItem("Save as");
		JMenuItem menuItem5 = new JMenuItem("Exit");
		JMenuItem menuItem6 = new JMenuItem("position 5");
		JMenuItem menuItem7 = new JMenuItem("position 6");
		
		menu1.add(menuItem1);
		menu1.add(menuItem2);
		menu1.addSeparator();
		menu1.add(menuItem3);
		menu1.add(menuItem4);
		menu1.addSeparator();
		menu1.add(menuItem5);
		
		menu2.add(menuItem6);
		menu2.add(menuItem7);
		
		menuBar.add(menu1);
		menuBar.add(menu2);
		menuBar.add(menu3);
		menuBar.add(menu4);
		
		menuItem5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent event) {
				System.exit(1);
			}
		});
		
		frame.setJMenuBar(menuBar);
		
		frame.setVisible(true);
	}

}
