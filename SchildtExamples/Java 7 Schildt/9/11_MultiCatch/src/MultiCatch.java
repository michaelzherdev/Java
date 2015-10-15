// Применение средства многократного перехвата исключений
public class MultiCatch {
	public static void main(String[] args) {
		int a=88, b=0;
		int result;
		char chrs[] = {'A', 'B', 'C'};
		for(int i=0; i<2; i++) {
			try {
				if(i==0)
					// сгенерировать исключение ArithmeticException
					result = a/b; 
				else
					// сгенерироить исключение ArrayIndexOutOfBoundsException
					chrs[5] = 'X';
			}
			// перехват обоих исключений
			catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
				System.out.println("Exception caught: " + e);
			}
		}
		System.out.println("After multi-catch");
	}	
}
