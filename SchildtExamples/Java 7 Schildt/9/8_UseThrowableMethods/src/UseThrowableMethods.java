// Применение методов из класса Throwable
class ExcTest {
	static void genException() {
		int nums[] = new int[4];
		System.out.println("Before exception is generated.");
		// сгенерировать исключение в связи с попыткой
		// обращения за границы массива
		nums[7] = 10;
		System.out.println("This won`t be displayed");
	}
}

public class UseThrowableMethods {
	public static void main(String[] args) {
		try {
			ExcTest.genException();
		}
		catch(ArrayIndexOutOfBoundsException exc) {
			// перехватить исключение
			System.out.println("Standard message is: ");
			System.out.println(exc);
			System.out.println("\nStack trace: ");
			exc.printStackTrace();
		}
		System.out.println("After catch statement.");
	}

}
