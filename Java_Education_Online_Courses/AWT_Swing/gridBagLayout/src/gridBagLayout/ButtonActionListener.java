package gridBagLayout;

import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

// Урок 11 ActionListener
public class ButtonActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() instanceof JButton)
			String nameButton = ((JButton)e.getSource().getText());
		System.out.println("nameButton = " + nameButton);
		String str1 = loginTextField.getText();
		String str2 = passwordTextField.getText();
		
		loginTextField.setText(str2);
		passwordTextField.setText(str1);
		
		System.out.println("Action!");
	}
}