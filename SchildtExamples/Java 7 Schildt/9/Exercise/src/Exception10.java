// Исключение, возникающее при переполнении стека
class StackFullException extends Exception {
	int size;
	
	StackFullException(int s) {size = s;}
	
	public String toString() {
		return "\nStack is full. Maximum size is " + size;
	}
}
// Исключение, возникающее при обращении к пустому стеку
class StackEmptyException extends Exception {
	
	public String toString() {
		return "\nStack is empty.";
	}
}
// Класс, реализующий стек для хранения символов.
class Stack {
	private char stck[]; // Массив для хранения элементов стека
	private int tos; // Вершина стека
	
	//построить пустой стек заданного размера
	Stack(int size) {
		stck = new char[size]; // выделить память для стека
		tos = 0;
	}
	
	// построить один стек из другого стека
	Stack(Stack ob) {
		tos = ob.tos;
		stck = new char[ob.stck.length];
		// скопировать элементы
		for(int i=0; i<tos; i++)
			stck[i] = ob.stck[i];
	}
	// построить стек с исходными значениями
	Stack(char a[]) {
		stck = new char[a.length];
		for(int i=0; i<a.length; i++) {
			try {
				push(a[i]);
			}
			catch(StackFullException exc) {
				System.out.println(exc);
			}
		}
	}
	// поместить символы в стек
	void push(char ch) throws StackFullException {
		if(tos==stck.length)
			throw new StackFullException(stck.length);
		
		stck[tos] = ch;
		tos++;
	}
	// извлечь символы из стека
	char pop() throws StackEmptyException {
		if(tos==0)
			throw new StackEmptyException();
		tos--;
		return stck[pos];
	}
}
