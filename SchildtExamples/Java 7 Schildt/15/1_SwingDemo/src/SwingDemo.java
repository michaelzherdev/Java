// ������� swing-���������
import javax.swing.*;

public class SwingDemo {
	
	SwingDemo() {
		// �������� ������ ���������� JFrame
		JFrame jfrm = new JFrame("A simple Awing Application");
		
		// ��������� ��������� �������� ����� ����
		jfrm.setSize(275, 100);
		
		// ��� �������� ���� ��������� ������ �����������
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// �������� ��������� ����� � ������� ���������� Swing
		JLabel jlab = new JLabel(" Swing defines the modern Java GUI.");
		
		// ���������� ����� �� ������ �����������
		jfrm.add(jlab);
		
		// ����������� ����� ����
		jfrm.setVisible(true);
	}

	public static void main(String[] args) {
		// ������ SwingDemo �/� ������ � ������ ��������������� �������
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new SwingDemo();
			}
		});
	}
}
