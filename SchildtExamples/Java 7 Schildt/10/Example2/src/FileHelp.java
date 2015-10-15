import java.io.*;

class Help {
	String helpfile; // имя файла со справочной информацией
	
	Help(String fname) {
		helpfile = fname;
	}
	// отобразить справочную информацию по заданной теме
	boolean helpon(String what) {
		int ch;
		String topic, info;
		
		// открыть справочный файл
		try (BufferedReader helpRdr = new BufferedReader(new FileReader(helpfile))) {
			do {
				//читать символы до тех пор, пока не встретиться знак #
				ch = helpRdr.read();
				// проверить, совпадают ли темы
				if(ch=='#') {
					topic = helpRdr.readLine();
					if(what.compareTo(topic) == 0) { //found topic
						do {
							info = helpRdr.readLine();
							if(info != null) System.out.println(info);
						} while((info != null) && (info.compareTo("") != 0));
						return true;
					}
				}
			} while(ch != -1);
		} catch(IOException exc) {
			System.out.println("Error accessing help file.");
			return false;
		}
		return false;
	}
	
	//получить тему
	String getSelection() {
		String topic = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter topic: ");
		try {
			topic = br.readLine();
		} catch(IOException exc) {
			System.out.println("Error reading console.");
		}
		return topic;
	}
}

// продемонстрировать справочную систему, находящуюся на диске 
public class FileHelp {
	public static void main(String[] args) {
		Help hlpobj = new Help("helpfile.txt");
		String topic;
		
		System.out.println("Try the help system. " + "Enter 'stop' to end.");
		
		do {
			topic = hlpobj.getSelection();
			
			if(!hlpobj.helpon(topic))
				System.out.println("Topic not found.\n");
		} while(topic.compareTo("stop") != 0);
	}
}
