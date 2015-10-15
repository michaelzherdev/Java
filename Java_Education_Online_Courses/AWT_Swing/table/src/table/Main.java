package table;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import com.mysql.jdbc.Connection;

public class Main {

	public static void main(String[] args) {
		
		ConnectionDb connect = new ConnectionDb("localhost", "root", "de2");
		connect.setNameDataBases("lesson");
		connect.initProperties();
		connect.init();
		
		JFrame frame = new JFrame();
		frame.setSize(600, 400);
		frame.setTitle("this is title form");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new GridBagLayout());
		
		BookTableModel btm = new BookTableModel();
		JTable bookTable = new JTable(btm);
		JScrollPane bookTableScrollPage = new JScrollPane(bookTable); 
		bookTableScrollPage.setPreferredSize(new Dimension(400, 400));
		
	//	String str[] = new String[4];
	//	str[0] = "0";
	//	str[1] = "название книга";
	//	str[2] = "45558756";
	//	str[3] = "описание книги";
	//	btm.addDate(str);
		
		
		
		JButton addButton = new JButton("Добавить");
		JButton deleteButton = new JButton("Удалить");
		JButton clearButton = new JButton("Очистить");
		
		frame.add(bookTableScrollPage, new GridBagConstraints(0, 0, 3, 1, 1, 1, GridBagConstraints.NORTH,
				GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0));
		frame.add(addButton, new GridBagConstraints(0, 1, 1, 1, 1, 1, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(1, 1, 1, 1), 0, 0));
		frame.add(deleteButton, new GridBagConstraints(1, 1, 1, 1, 1, 1, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(1, 1, 1, 1), 0, 0));
		frame.add(clearButton, new GridBagConstraints(2, 1, 1, 1, 1, 1, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(1, 1, 1, 1), 0, 0));
				
		frame.setVisible(true);
		frame.pack();
	}

}
