// Класс, реализующий очередь для хранения символов
class Queue {
	char q[]; // Массив для хранения элементов очереди
	int putloc, getloc; // Индексы размещения и извлечения элементов очереди
	
	Queue (int size) {
		q = new char[size+1]; // выделить память для очереди
		putloc = getloc = 0;
	}
	// поместить символ в очередь
	void put(char ch) {
		if(putloc==q.length-1) {
			System.out.println(" - Queue is full.");
			return;
		}
		putloc++;
		q[putloc] = ch;
	}
	// извлечь символ из очереди
	char get() {
		if(getloc==putloc) {
			System.out.println(" - Queue is empty.");
			return (char) 0;
		}
		getloc++;
		return q[getloc];
	}
}

public class QDemo {

	public static void main(String[] args) {
		Queue bigQ = new Queue(100);
		Queue smallQ = new Queue(4);
		char ch;
		int i;
		System.out.println("Using bigQ to store the alphabet.");
		// поместить буквенные символочередь bigQ
		for (i=0; i<26; i++)
			bigQ.put((char) ('A' + i));
		// извлечь буквенные символы из очереди bigQ и отобразить
		System.out.print("Contents of bigQ: ");
		for (i=0; i<26; i++) {
			ch = bigQ.get();
			if(ch != (char) 0) System.out.print(ch);
		}
		
		System.out.println("\n");
		
		System.out.println("Using smallQ to generate errors.");
		for (i=0; i<5; i++) {
			System.out.print("Attempting to store " + (char) ('Z' - i));
			smallQ.put((char) ('Z' - i));
			System.out.println();	
		}
		System.out.println();
		// дополнительные ошибки при обращении к очереди smallQ
		System.out.print("Contents of smallQ: ");
		for (i=0; i<5; i++) {
			ch = smallQ.get();
			if(ch != (char) 0) System.out.print(ch);
		}
	}

}
