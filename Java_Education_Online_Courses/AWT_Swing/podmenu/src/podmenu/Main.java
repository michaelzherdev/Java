package podmenu;

import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;

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
		
		JMenu itemMenu1 = new JMenu("punkt 1");
		JMenuItem itemMenu2 = new JMenuItem("punkt 2");
		JMenu itemMenu3 = new JMenu("punkt 3");
		JMenu itemMenu4 = new JMenu("punkt 4");
		JMenu itemMenu5 = new JMenu("punkt 5");
		
		JMenuItem submenuItem1 = new JMenuItem("subMenu1");
		JMenu submenuItem2 = new JMenu("subMenu2");
		JMenuItem submenuItem3 = new JMenuItem("subMenu3");
		JMenuItem submenuItem4 = new JMenuItem("subMenu4");
		
		itemMenu3.setIcon(new ImageIcon("2.png"));
		
		itemMenu3.add(submenuItem1);
		itemMenu3.add(submenuItem2);
		itemMenu3.add(submenuItem3);
		itemMenu3.add(submenuItem4);
		
		menu1.add(itemMenu1);
		menu1.add(itemMenu2);
		menu1.add(itemMenu3);
		menu1.add(itemMenu4);
		menu1.add(itemMenu5);
		
		menuBar.add(menu1);
		menuBar.add(menu2);
		
		JRadioButtonMenuItem radioButton1 = new JRadioButtonMenuItem("radio button 1");
		JRadioButtonMenuItem radioButton2 = new JRadioButtonMenuItem("radio button 2");
		JRadioButtonMenuItem radioButton3 = new JRadioButtonMenuItem("radio button 3");
		
		
		/*
		JRadioButton radioButton1 = new JRadioButton("radio button 1");
		JRadioButton radioButton2 = new JRadioButton("radio button 2");
		JRadioButton radioButton3 = new JRadioButton("radio button 3");
		*/
		ButtonGroup bg = new ButtonGroup();
		bg.add(radioButton1);
		bg.add(radioButton2);
		bg.add(radioButton3);
		
		submenuItem2.add(radioButton1);
		submenuItem2.add(radioButton2);
		submenuItem2.add(radioButton3);
		
		
		
		frame.setJMenuBar(menuBar);
		
		frame.setVisible(true);
	}

}
