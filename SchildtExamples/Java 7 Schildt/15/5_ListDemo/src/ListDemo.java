// применение поля ввода текста
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class ListDemo implements ListSelectionListener {
	JList<String> jlist;
	JLabel jlab;
	JScrollPane jscrlp;
	
	// создать массив имен
	String names[] = {"Sherry", "Michael", "John", "Rachel", "Sasha", "Randy",
			"Tom", "Mary", "Ken", "Andrew", "Todd" };
	
	ListDemo() {
		// создание нового контейнера JFrame
		JFrame jfrm = new JFrame("JList Demo");
		
		// установить диспетчер компоновки
		jfrm.setLayout(new FlowLayout());
		
		// установка начальных размеров рамки окна
		jfrm.setSize(200, 160);
		
		// при закрытии окна программа должна завершиться
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// создать компонент JList
		jlist = new JList<String>(names);
		
		// задать режим выбора элементов из списка
		// переход в режим выбора элементов из списка по одному
		jlist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		// добавить список на панели прокрутки
		// Компонент списка помещается в контейнер панели прокрутки
		jscrlp = new JScrollPane(jlist);
		
		// задать предпочтительные размеры панели прокрутки
		jscrlp.setPreferredSize(new Dimension(120, 90));
		
		// создание метки для отображения результатов выбора из списка
		jlab = new JLabel("Please choose a name");
		
		// обавить обработчик событий, связанных с выбором из списка
		jlist.addListSelectionListener(this);
		
		// добавление списка и метки на панель содержимого
		 jfrm.add(jscrlp);
		 jfrm.add(jlab);
		 
		// отображение рамки окна
		jfrm.setVisible(true);
	}

	// обработка событий от кнопки
	public void valueChanged (ListSelectionEvent le) {
			int idx = jlist.getSelectedIndex();
			
			if(idx != -1)
				jlab.setText("Current selection: " + names[idx]);
			else
				jlab.setText("Please choose a name.");
	}
			
	
	public static void main(String[] args) {
		// Объект SwingDemo д/б создан в потоке диспетчеризации событий
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new ListDemo();
			}
		});
	}
}
