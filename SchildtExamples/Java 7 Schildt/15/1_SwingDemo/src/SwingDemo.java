// простая swing-программа
import javax.swing.*;

public class SwingDemo {
	
	SwingDemo() {
		// создание нового контейнера JFrame
		JFrame jfrm = new JFrame("A simple Awing Application");
		
		// установка начальных размеров рамки окна
		jfrm.setSize(275, 100);
		
		// при закрытии окна программа должна завершиться
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// создание текстовой метки с помощью компонента Swing
		JLabel jlab = new JLabel(" Swing defines the modern Java GUI.");
		
		// добавление метки на панели содержимого
		jfrm.add(jlab);
		
		// отображение рамки окна
		jfrm.setVisible(true);
	}

	public static void main(String[] args) {
		// Объект SwingDemo д/б создан в потоке диспетчеризации событий
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new SwingDemo();
			}
		});
	}
}
