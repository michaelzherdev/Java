// В этом классе реализуется отказоустойчивый массив
// предотвращающий ошибки при выполнении программы
class FailSoftArray {
	private int a[]; //ссылка на массив
	private int errval; // значение, возвращамое в случае, если
						// в методе get() будет обнаружена ошибка
	public int length; // переменная length открыта
	
	/*Конструктору данного класса передается размер массива и значение,
	 * которое должен возвращать метод get при обнаружении ошибки
	 */
	public FailSoftArray(int size, int errv) {
		a = new int[size];
		errval = errv;
		length = size;
	}
	// возвратить значение элемента массива по заданному индексу
	public int get(int index) {
	// отслеживание попытки обращения за границы массива
		if(ok(index)) return a[index];
		return errval;
	}
	//установить значение элемента по заданному индексу,
	// если возникнет ошибка, возвратить false
	public boolean put(int index, int val) {
	// отслеживание попытки обращения за границы массива
		if(ok(index)) {
			a[index] = val;
			return true;
		}
		return false;
	}
	// возвратить true, если индекс не выходит за границы массива
	private boolean ok(int index) {
		if(index >= 0 & index < length) return true;
		return false;
	}
}

public class FSDemo {
	public static void main(String[] args) {
		FailSoftArray fs = new FailSoftArray(5, -1);
		int x;
		
		// выявить скрытые сбои при обращении к массиву
		System.out.println("Fail quietly.");
		for (int i=0; i<(fs.length*2); i++)
		//Доступ к массиву должен осуществляться с помощью
		// специально предназначенных для этого методов
			fs.put(i, i*10);
		for (int i=0; i<(fs.length*2); i++) {
			x = fs.get(i);
			if(x!=-1) System.out.print(x + " ");
		}
		System.out.println("");
		
// а теперь обрабатывать сбои и вывести сообщения об ошибках
		System.out.println("\nFail with error reports.");
		for (int i=0; i<(fs.length*2); i++)
			if (!fs.put(i, i*10))
				System.out.println("Index " + i + " out-of-boubds");
		for (int i=0; i<(fs.length*2); i++){
			x = fs.get(i);
			if(x!=-1) System.out.print(x + " ");
			else
				System.out.println("Index " + i + " out-of-boubds");
	}
	}
}
