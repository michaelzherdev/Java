// Генерирование исключения вручную.
public class ThrowDemo {
	public static void main(String[] args) {
		try {
				System.out.println("Before throw.");
				// генерирование исключения
				throw new ArithmeticException();
			}
			catch(ArithmeticException exc) {
				// перехватить исключение
				System.out.println("Exception caught!");
			}
		System.out.println("After try/catch block");
		}
	}
			
