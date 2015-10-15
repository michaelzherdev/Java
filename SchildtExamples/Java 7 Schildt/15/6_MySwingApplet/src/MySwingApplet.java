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
		
	// инициализировать апплет
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
	
	// установить и инициализировать графический интерфейс
	private void makeGUI() {
		setLayout(new FlowLayout());
		
		// create buttons
		jbtnUp = new JButton("Up");
		jbtnDown = new JButton("Down");
		
		// добавить приемник событий от кнопки Up
		jbtnUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				jlab.setText("You pressed Up");
			}
		});
		
		// добавить приемник событий от кнопки Down
				jbtnDown.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent ae) {
						jlab.setText("You pressed Down");
					}
				});
	
		// 	добавление кнопки на панель содержимого
		 add(jbtnUp);
		 add(jbtnDown);
		 		 
		// создать текстовую строку
		jlab = new JLabel("Press a button.");
		
		// добавьте метку на панели содержимого
		add(jlab);
	}
}