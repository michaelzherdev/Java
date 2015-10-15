// утилита сравнени€ файлов, создаваема€ на основе Swing
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class SwingFC implements ActionListener {
	JTextField jtfFirst;
	JTextField jtfSecond;
	JButton jbtnComp;
	JLabel jlabFirst, jlabSecond;
	JLabel jlabResult;
		
	SwingFC() {
		// создание нового контейнера JFrame
		JFrame jfrm = new JFrame("JList Demo");
		
		// установить диспетчер компоновки
		jfrm.setLayout(new FlowLayout());
		
		// установка начальных размеров рамки окна
		jfrm.setSize(200, 190);
		
		// при закрытии окна программа должна завершитьс€
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// пол€ дл€ ввода имен
		jtfFirst = new JTextField(14);
		jtfSecond = new JTextField(14);
		
		// установить команды действи€
		jtfFirst.setActionCommand("fileA");
		jtfSecond.setActionCommand("fileB");
		
		//
		JButton jbtnComp = new JButton("Compare");
		
		jbtnComp.addActionListener(this);
		
		// метки
		jlabFirst = new JLabel("First file: ");
		jlabSecond = new JLabel("Second file: ");
		jlabResult = new JLabel("");

		// 	добавление списка и метки на панель содержимого
		 jfrm.add(jlabFirst);
		 jfrm.add(jtfFirst);
		 jfrm.add(jlabSecond);
		 jfrm.add(jtfSecond);
		 jfrm.add(jbtnComp);
		 jfrm.add(jlabResult);
		 
		// отображение рамки окна
		jfrm.setVisible(true);
	}

	// сравнить файлы после нажати€ кнопки Compare
	public void actionPerformed (ActionEvent ae) {
			int i=0, j=0;
			// убедитьс€, что введены имена обоих файлов
			if(jtfFirst.getText().equals("")) {
				jlabResult.setText("First file name missing");
				return;
			}
			if(jtfSecond.getText().equals("")) {
				jlabResult.setText("Second file name missing");
				return;
			}
			
			// сравнить файлы, использу€ оператор try с ресурсами
			try (FileInputStream f1 = 
					new FileInputStream(jtfFirst.getText());
			FileInputStream f2 = 
					new FileInputStream(jtfSecond.getText()))
					{
			// проверить содержимое файла
					do {
						i = f1.read();
						j = f2.read();
						if (i != j) break;
					} while (i != -1 && j != -1);
					
					if(i!=j)
						jlabResult.setText("Files are not the same");
					else
						jlabResult.setText("Files compare equal");
			} catch(IOException exc) {
				jlabResult.setText("File Error");
			}
	}
	
	public static void main(String[] args) {
		// ќбъект SwingDemo д/б создан в потоке диспетчеризации событий
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new SwingFC();
			}
		});
	}
}
