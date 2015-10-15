// Класс, реализующий стек для хранения символов.
class Stack {
	private char stck[]; // Массив для хранения элементов стека
	private int tos; // Вершина стека
	
	// построить пустой стек заданного размера
	Stack(int size) {
		stck = new char[size];// выделить память для стека
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
			push(a[i]);
		}
	}
	// поместить символы в стек
	void push(char ch) {
		if(tos==stck.length) {
			System.out.println(" -- Stack is full");
			return;
		}
	stck[tos] = ch;
	tos++;
	}
	// извлечь символы из стека
	char pop() {
		if(tos==0) {
			System.out.println(" -- Stack is empty");
			return (char) 0;
		}
		tos--;
		return stck[tos];
	}
}
public class SDemo {

	public static void main(String[] args) {
		// создать пустой стек на 10 элементов
		Stack stk1 = new Stack(10);
		char name[] = {'T', 'o', 'm'};
		// построить стек из массива
		Stack stk2 = new Stack(name);
		
		char ch;
		int i;
		
		// поместить символы в стек stk1
		for (i=0; i<10; i++)
			stk1.push((char)('A'+i));
		// построить один стек из другого стека
			Stack stk3 = new Stack(stk1);
		// отобразить стеки
			System.out.print("Contents of stk1: ");
			for (i=0; i<10; i++) {
				ch = stk1.pop();
				System.out.print(ch);
			}
			
			System.out.println();
			
			System.out.print("Contents of stk2: ");
			for (i=0; i<3; i++) {
				ch = stk2.pop();
				System.out.print(ch);
			}
			System.out.println();
			System.out.print("Contents of stk2: ");
			for (i=0; i<10; i++) {
				ch = stk3.pop();
				System.out.print(ch);
			}
	}

}
