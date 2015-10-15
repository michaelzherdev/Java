// Исключение м/б сгенерировано одним методом, а перехвачено другим
class ExcTest {
	// сгенерировать исключение
	static void genException() {
		int nums[] = new int[4];
		System.out.println("Before exception is generated.");
		
		// Здесь генерируется исключение в связи
		// с обращением за границы массива
		nums[7] = 10;
		System.out.println("This won`t be displayed");
	}
}

public class ExcDemo2 {
	public static void main(String[] args) {
		try {
			ExcTest.genException();
		}
		// А здесь исключение перехватывается
		catch (ArrayIndexOutOfBoundsException exc) {
			System.out.println("Index out-of-bounds!");
		}
		System.out.println("After catch statement");
	}

}
