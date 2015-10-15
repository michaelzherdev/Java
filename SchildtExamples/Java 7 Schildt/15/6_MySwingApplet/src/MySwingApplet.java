// Swing-applet
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/* <object code="MySwingApplet" width=200 height=80>
 * </object>
 */
public class MySwingApplet extends JApplet {
	JButton jbtnUp, jbtnDown;
	JLabel jlab;
		
	// ���������������� ������
	public void init() {
		try {
			SwingUtilities.invokeAndWait(new Runnable() {
				public void run() {
					makeGUI();
				}
			});
		} catch(Exception exc) {
			System.out.println("Can`t create because of " + exc);
		}
	}
	
	// ���������� � ���������������� ����������� ���������
	private void makeGUI() {
		setLayout(new FlowLayout());
		
		// create buttons
		jbtnUp = new JButton("Up");
		jbtnDown = new JButton("Down");
		
		// �������� �������� ������� �� ������ Up
		jbtnUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				jlab.setText("You pressed Up");
			}
		});
		
		// �������� �������� ������� �� ������ Down
				jbtnDown.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent ae) {
						jlab.setText("You pressed Down");
					}
				});
	
		// 	���������� ������ �� ������ �����������
		 add(jbtnUp);
		 add(jbtnDown);
		 		 
		// ������� ��������� ������
		jlab = new JLabel("Press a button.");
		
		// �������� ����� �� ������ �����������
		add(jlab);
	}
}