package gridBagLayout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame("����������� � �������: ");
		
		frame.setSize(250, 150);
		frame.setTitle("this is title form");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new GridBagLayout());

		JLabel login = new JLabel("Login: ");
		JLabel password = new JLabel("Password ");
		
		JButton loginButton = new JButton("Login in");
		JButton registrationButton = new JButton("Registration");
		
		
		
		JTextField loginTextField = new JTextField(15);
		JPasswordField passwordTextField = new JPasswordField(15);
		
		GridBagConstraints c = new GridBagConstraints();
		
		loginButton.addActionListener(new ButtonActionListener());
		
	//	c.gridx = 0;
	//	c.gridy = 0;
	//	c.gridwidth = 1; // �������� ���� ������ �� �����������
	//	c.gridheight = 2; // � ��� �� ���������
	//	c.weightx = 0; // ��� ����� ���������� �������� �� ����
	//	c.weighty = 0;
	//	c.anchor = GridBagConstraints.NORTH; // ��� ����� ����������� ��������� 
	//	c.fill = GridBagConstraints.HORIZONTAL; // ��� ����� �������������
	//	c.insets = new Insets(1, 2, 3, 4); // 1 - top, 2 - left, 3 - bottom, 4 - right
	//	c.ipadx = 0; // ��������� ��������� ����� ��������
	//	c.ipady = 0;
	//	frame.add(loginButton, c);
		
		frame.add(login, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(1, 2, 3, 4), 0, 0));
		frame.add(password, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(1, 2, 3, 4), 0, 0));
		frame.add(loginTextField, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(1, 2, 3, 4), 0, 0));
		frame.add(passwordTextField, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(1, 2, 3, 4), 0, 0));
		frame.add(loginButton, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(1, 2, 3, 4), 0, 0));
		frame.add(registrationButton, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(1, 2, 3, 4), 0, 0));
		
		frame.setVisible(true);
		frame.pack(); // ������ ������ ������������
	}

}
