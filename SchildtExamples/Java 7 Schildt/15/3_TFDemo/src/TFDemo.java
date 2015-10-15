// применение поля ввода текста
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TFDemo implements ActionListener {
	JTextField jtf;
	JButton jbtnRev;
	JLabel jlabPrompt, jlabContents;
	
	TFDemo() {
		// создание нового контейнера JFrame
		JFrame jfrm = new JFrame("Use a text field");
		
		// установить диспетчер компоновки
		jfrm.setLayout(new FlowLayout());
		
		// установка начальных размеров рамки окна
		jfrm.setSize(240, 120);
		
		// при закрытии окна программа должна завершиться
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//создание двух кнопок
		JButton jbtnUp = new JButton("Up");
		JButton jbtnDown = new JButton("Down");
		
		// создание поля ввода текста шириной 10 символов
		jtf = new JTextField(10);
		
		// установка команды действия для поля ввода текста
		jtf.setActionCommand("myTF");
		
		// создать кнопку Reverse
		JButton jbtnRev = new JButton("Reverse");
		
		// добавление приемников событий от кнопки
		jtf.addActionListener(this);
		jbtnRev.addActionListener(this);
		
		// создание текстовой метки
		jlabPrompt = new JLabel("Enter text: ");
		jlabContents = new JLabel("");
				
		// добавление компонентов на панель содержимого
		 jfrm.add(jlabPrompt);
		 jfrm.add(jtf);
		 jfrm.add(jbtnRev);
		 jfrm.add(jlabContents);
		 
		// отображение рамки окна
		jfrm.setVisible(true);
	}

	// обработка событий от кнопки
	public void actionPerformed (ActionEvent ae) {
		// для определения нажатой кнопки исп. команда действия
		if(ae.getActionCommand().equals("Reverse")) {
			// нажатие кнопки Reverse
			String orgStr = jtf.getText();
			String resStr = "";
			
			// обратить символьную строку в поле ввода текста
			for(int i=orgStr.length()-1; i>=0; i--)
				resStr += orgStr.charAt(i);
				
			// сохранить обращенную строку в поле ввода текста
				jtf.setText(resStr);
		} else
			// нажатие клавиши enter в тот момент, когда фокус
			// ввода нахоится в поле ввода текста
			jlabContents.setText("You pressed ENTER. Text is: "
					+ jtf.getText());
	}
	
	public static void main(String[] args) {
		// Объект SwingDemo д/б создан в потоке диспетчеризации событий
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new TFDemo();
			}
		});
	}
}
