// ���������� ���� ����� ������
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class ListDemo implements ListSelectionListener {
	JList<String> jlist;
	JLabel jlab;
	JScrollPane jscrlp;
	
	// ������� ������ ����
	String names[] = {"Sherry", "Michael", "John", "Rachel", "Sasha", "Randy",
			"Tom", "Mary", "Ken", "Andrew", "Todd" };
	
	ListDemo() {
		// �������� ������ ���������� JFrame
		JFrame jfrm = new JFrame("JList Demo");
		
		// ���������� ��������� ����������
		jfrm.setLayout(new FlowLayout());
		
		// ��������� ��������� �������� ����� ����
		jfrm.setSize(200, 160);
		
		// ��� �������� ���� ��������� ������ �����������
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// ������� ��������� JList
		jlist = new JList<String>(names);
		
		// ������ ����� ������ ��������� �� ������
		// ������� � ����� ������ ��������� �� ������ �� ������
		jlist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		// �������� ������ �� ������ ���������
		// ��������� ������ ���������� � ��������� ������ ���������
		jscrlp = new JScrollPane(jlist);
		
		// ������ ���������������� ������� ������ ���������
		jscrlp.setPreferredSize(new Dimension(120, 90));
		
		// �������� ����� ��� ����������� ����������� ������ �� ������
		jlab = new JLabel("Please choose a name");
		
		// ������� ���������� �������, ��������� � ������� �� ������
		jlist.addListSelectionListener(this);
		
		// ���������� ������ � ����� �� ������ �����������
		 jfrm.add(jscrlp);
		 jfrm.add(jlab);
		 
		// ����������� ����� ����
		jfrm.setVisible(true);
	}

	// ��������� ������� �� ������
	public void valueChanged (ListSelectionEvent le) {
			int idx = jlist.getSelectedIndex();
			
			if(idx != -1)
				jlab.setText("Current selection: " + names[idx]);
			else
				jlab.setText("Please choose a name.");
	}
			
	
	public static void main(String[] args) {
		// ������ SwingDemo �/� ������ � ������ ��������������� �������
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new ListDemo();
			}
		});
	}
}
