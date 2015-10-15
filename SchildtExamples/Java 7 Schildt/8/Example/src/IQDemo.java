// Класс, реализующий очередь фиксированного размера
// для хранения символов
class FixedQueue implements ICharQ {
	private char q[];// массив для хранения элементов очереди
	private int putloc, getloc; // индексы размещения и извлечения элементов очереди
	
	// создать пустую очередь заданного размера
	public FixedQueue(int size) {
		q = new char[size+1]; //выделить память для очереди
		putloc = getloc = 0;
	}
	
	//поместить символ в очередь
	public void put(char ch) {
		if(putloc==q.length-1) {
			System.out.println(" - Queue is full.");
			return;
		}
		putloc++;
		q[putloc] = ch;
	}
	
	// извлечь символ из очереди
	public char get() {
		if(getloc==putloc) {
			System.out.println(" - Queue is empty.");
			return (char) 0;
		}
		getloc++;
		return q[getloc];
	}
}

// Кольцевая очередь
class CircularQueue implements ICharQ {
	private char q[];// массив для хранения элементов очереди
	private int putloc, getloc; // индексы размещения и извлечения элементов очереди
	
	// создать пустую очередь заданного размера
	public CircularQueue(int size) {
		q = new char[size+1]; //выделить память для очереди
		putloc = getloc = 0;
	}
	
	//поместить символ в очередь
	public void put(char ch) {
	/* очередь считается полной, если индекс putloc на 1 меньше индекса getloc 
	 * или если индекс putloc указывает на конец массива, а индекс getloc - на его начало
	 */
		if(putloc+1==getloc | ((putloc==q.length-1) & (getloc==0))) {
			System.out.println(" - Queue is full.");
			return;
		}
		putloc++;
		if(putloc==q.length)
			putloc = 0; // перейти в начало массива
		q[putloc] = ch;
	}
	
	// извлечь символ из очереди
	public char get() {
		if(getloc==putloc) {
			System.out.println(" - Queue is empty.");
			return (char) 0;
		}
		getloc++;
		if(getloc==q.length)
			getloc = 0; // ернуться в начало очереди
		return q[getloc];
	}
}

// Динамическая очередь
class DynQueue implements ICharQ {
	private char q[];// массив для хранения элементов очереди
	private int putloc, getloc; // индексы размещения и извлечения элементов очереди
	
	// создать пустую очередь заданного размера
	public DynQueue(int size) {
		q = new char[size+1]; //выделить память для очереди
		putloc = getloc = 0;
	}
	
	//поместить символ в очередь
	public void put(char ch) {
		if(putloc==q.length-1) {
			// увеличить размер очереди
			char t[] = new char[q.length * 2];
			
			// скопировать элементы в новую очередь
			for(int i=0; i<q.length; i++)
				t[i] = q[i];
			q=t;
		}	
		putloc++;
		q[putloc] = ch;
	}
	
	// извлечь символ из очереди
	public char get() {
		if(getloc==putloc) {
			System.out.println(" - Queue is empty.");
			return (char) 0;
		}
		getloc++;
		return q[getloc];
}
}

// Демонстрация трех реализация интерфейса ICharQ
public class IQDemo {
	public static void main(String[] args) {
		FixedQueue q1 = new FixedQueue(10);
		DynQueue q2 = new DynQueue(10);
		CircularQueue q3 = new CircularQueue(10);

		ICharQ iQ;
		
		char ch;
		int i;
		
		iQ = q1;
		// поместить ряд символов в очередь фиксированого размера
		for(i=0; i<10; i++)
			iQ.put((char)('A'+i));
		
		// отобразить содержимое очереди
		System.out.print("Contents of fixed queue: ");
		for(i=0; i<10; i++) {
			ch = iQ.get();
			System.out.print(ch);
		}
		System.out.println();
		
		iQ = q2;
		// поместить ряд символов в динамическую очередь
		for(i=0; i<10; i++)
			iQ.put((char)('Z'-i));
		
		// отобразить содержимое очереди
		System.out.print("Contents of dynamic queue: ");
		for(i=0; i<10; i++) {
			ch = iQ.get();
			System.out.print(ch);
		}
		
			System.out.println();
			
			iQ = q3;
			// поместить ряд символов в кольцевую очередь
			for(i=0; i<10; i++)
				iQ.put((char)('A'+i));
			
			// отобразить содержимое очереди
			System.out.print("Contents of circular queue: ");
			for(i=0; i<10; i++) {
				ch = iQ.get();
				System.out.print(ch);	
	}
			System.out.println();
			
			// поместить больше символов в кольцевую очередь
			for(i=10; i<20; i++)
				iQ.put((char)('A'+i));
			
			// отобразить содержимое очереди
			System.out.print("Contents of circular queue: ");
			for(i=0; i<10; i++) {
				ch = iQ.get();
				System.out.print(ch);	
			}
			System.out.println("\nStore and consume from" + " circular queue.");

			// поместить символы в кольцевую очередь и извлечь их оттуда
			for(i=0; i<20; i++) {
				iQ.put((char)('A'+i));
				ch = iQ.get();
				System.out.print(ch);
			}
	}
}
