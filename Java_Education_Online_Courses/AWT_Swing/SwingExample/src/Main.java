import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JTextField;


public class Main {
	public static void main(String[] args) throws InterruptedException {
		JFrame frame = new JFrame();
		
		frame.setSize(600, 400);
		frame.setTitle("this is title form");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null); // ������� ���������� ������ ���� null
		frame.setLayout(new GridBagLayout());
		
	///////////////////////
		
		// frame.setResizable(false); // �������� ����
		// frame.setUndecorated(false); // ������ ������� ����
	//  Thread.sleep(3000);
	//	frame.setState(JFrame.ICONIFIED); // ������ ����� ��������� �����
	//	Thread.sleep(3000);
	//	frame.setExtendedState(JFrame.MAXIMIZED_BOTH); // ������ ����� �����������
	//	Thread.sleep(3000);
	//	frame.setExtendedState(JFrame.NORMAL); // ���������� � ���� ������
	
		//���� 2 Button
		JButton myButton = new JButton();
		JButton myButton2 = new JButton();
		
		Cursor cursor = new Cursor(Cursor.MOVE_CURSOR);
		myButton.setCursor(cursor);
		
		myButton.setText("My button");
		myButton2.setText("My button 2");
		frame.add(myButton); //�������� �� �����
	 // frame.add(myButton2);
		
		myButton.setBackground(Color.YELLOW); // ���
		myButton2.setBackground(new Color(255, 128, 128));
		myButton2.setForeground(Color.RED);
		
		// ���� 3 JTEXXTFIELD ������������ ���� �����
		
		JTextField textField = new JTextField(10);
		frame.add(textField);
		textField.setEditable(true); // ����� ������� �����
		textField.setText("textextext");
		
		JPasswordField passwordField = new JPasswordField(10);
		frame.add(passwordField);
		
		
		// ���� 4 �����
		JLabel label = new JLabel("����� �����-�� ����������");
		frame.add(label);
		label.setForeground(Color.green);
		Font font = new Font("Verdana", Font.ITALIC, 12);
		label.setFont(font);
		
		// ���� 5 progressBar - ������ ����-����
		JProgressBar progressBar = new JProgressBar();
		progressBar.setStringPainted(true); // ������� �����
		progressBar.setIndeterminate(true); // �������� ������ ������ ������
		progressBar.setMinimum(0);
		progressBar.setMaximum(100);
	//	progressBar.setValue(25);
		frame.add(progressBar);
		for(int i = progressBar.getMinimum(); i<=progressBar.getMaximum();i++){
			Thread.sleep(500);
			progressBar.setValue(i);
		}
		
		
		// JPanel - ����� ��������� ����� �����������
		JPanel panel = new JPanel();
		JPanel panel2 = new JPanel();
		JButton button = new JButton("Button");
		
		frame.add(panel);
		panel.add(button);
		panel.setBackground(Color.BLUE);
		panel2.setBackground(Color.GREEN);
		panel.add(panel2);
		
		Component[] comp = panel.getComponents();
		for(int i = 0; i < comp.length; i++) {
			if(comp[i] instanceof JPanel) System.out.println("panel");
			if(comp[i] instanceof JButton) System.out.println("button");
		}
		
		frame.setVisible(true);
	}

}
