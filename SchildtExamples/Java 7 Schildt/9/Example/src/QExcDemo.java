// Добавление обработчиков исклбчений в класс очереди
class QueueFullException extends Exception {
	int size;
	
	QueueFullException(int s) {
		size = s;
	}
	
	public String toString() {
		return "\nQueue is full. Maximum size is " + size;
	}
}
// Исключение, указывающее на опустошение очереди.
class QueueEmptyException extends Exception {
	public String toString() {
		return "\nQueue is empty.";
	}
}
// Класс, реализующий очередь фиксированного размера для хранения символов
class FixedQueue implements ICharQ {
	private char q[];// массив для хранения элементов очереди
	private int putloc, getloc; // индексы размещения и извлечения элементов очереди
	
	// создать пустую очередь заданного размера
	public FixedQueue(int size) {
		q = new char[size+1]; //выделить память для очереди
		putloc = getloc = 0;
	}
	//поместить символ в очередь
	public void put(char ch)
		throws QueueFullException {
			
		if(putloc==q.length-1) 
			throw new QueueFullException(q.length-1);
		
		putloc++;
		q[putloc] = ch;
	}
	
	// извлечь символ из очереди
	public char get()
		throws QueueEmptyException {
		if(getloc==putloc) 
			throw new QueueEmptyException();
		getloc++;
		return q[getloc];
	}
}

public class QExcDemo {
	public static void main(String[] args) {
		FixedQueue q = new FixedQueue(10);
		char ch;
		int i;
		
		try {
			// переполнение очереди
			for(i=0; i<11; i++) {
				System.out.print("Attempting to store: " + (char)('A'+i));
				q.put((char)('A'+i));
				System.out.println(" - OK");
			}
			System.out.println();
		}
		catch (QueueFullException exc) {
			System.out.println(exc);
		}
		System.out.println();
		
		try {
			// Попытка извлечь пустой символ из пустой очереди
			for(i=0; i<11; i++) {
				System.out.print("Getting next char: ");
				ch = q.get();
				System.out.println(ch);
		}
	}
		catch (QueueEmptyException exc) {
			System.out.println(exc);
		}
	}
}
