// применение поля ввода текста
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CBDemo implements ItemListener {
	JCheckBox jcbAlpha, jcbBeta, jcbGamma;
	JLabel jlabSelected, jlabChanged;
	
	CBDemo() {
		// создание нового контейнера JFrame
		JFrame jfrm = new JFrame("Demonstrate Check Boxes");
		
		// установить диспетчер компоновки
		jfrm.setLayout(new FlowLayout());
		
		// установка начальных размеров рамки окна
		jfrm.setSize(280, 120);
		
		// при закрытии окна программа должна завершиться
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// создание текстовой метки
		jlabSelected = new JLabel("");
		jlabChanged = new JLabel("");
		
		// создание флажков
		jcbAlpha = new JCheckBox("Alpha");
		jcbBeta = new JCheckBox("Beta");
		jcbGamma = new JCheckBox("Gamma");
		
		jcbAlpha.addItemListener(this);
		jcbBeta.addItemListener(this);
		jcbGamma.addItemListener(this);
		
		// добавление компонентов на панель содержимого
		 jfrm.add(jcbAlpha);
		 jfrm.add(jcbBeta);
		 jfrm.add(jcbGamma);
		 jfrm.add(jlabChanged);
		 jfrm.add(jlabSelected);
		 
		// отображение рамки окна
		jfrm.setVisible(true);
	}

	// обработка событий от кнопки
	public void itemStateChanged (ItemEvent ie) {
			String str = "";
			
			// получение ссылки на компонент флажка, сформировавший событие
			JCheckBox cb = (JCheckBox) ie.getItem();
			
			// сообщить об изменении состояния флажка
			if(cb.isSelected())
				jlabChanged.setText(cb.getText() + " was just selected");
			else
				jlabChanged.setText(cb.getText() + " was just cleared");
			
			// сообщить о всех установленных флажках
			if(jcbAlpha.isSelected()) {
				str += "Alpha";
			}
			if(jcbBeta.isSelected()) {
				str += "Beta";
			}
			if(jcbGamma.isSelected()) {
				str += "Gamma";
			}
			
			jlabSelected.setText("Selected check boxes: " + str);
	}
	
	public static void main(String[] args) {
		// Объект SwingDemo д/б создан в потоке диспетчеризации событий
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new CBDemo();
			}
		});
	}
}
