// емонстрация нажатия кнопки и обработки событий действия
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonDemo implements ActionListener {
	JLabel jlab;
	
	ButtonDemo() {
		// создание нового контейнера JFrame
		JFrame jfrm = new JFrame("A button example");
		
		// установить диспетчер компоновки
		jfrm.setLayout(new FlowLayout());
		
		// установка начальных размеров рамки окна
		jfrm.setSize(220, 90);
		
		// при закрытии окна программа должна завершиться
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//создание двух кнопок
		JButton jbtnUp = new JButton("Up");
		JButton jbtnDown = new JButton("Down");
		
		// добавление приемников событий от кнопки
		jbtnUp.addActionListener(this);
		jbtnDown.addActionListener(this);
		
		// добавление кнопок на панель содержимого
		 jfrm.add(jbtnUp);
		 jfrm.add(jbtnDown);
		 
		// создание текстовой метки
		JLabel jlab = new JLabel(" Press a button.");
		
		// добавление метки на панели содержимого
		jfrm.add(jlab);
		
		// отображение рамки окна
		jfrm.setVisible(true);
	}

	// обработка событий от кнопки
	public void actionPerformed (ActionEvent ae) {
		// для определения нажатой кнопки исп. команда действия
		if(ae.getActionCommand().equals("Up"))
			jlab.setText("You pressed Up");
		else
		jlab.setText("You pressed Down");
	}
	
	public static void main(String[] args) {
		// Объект SwingDemo д/б создан в потоке диспетчеризации событий
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new ButtonDemo();
			}
		});
	}
}
