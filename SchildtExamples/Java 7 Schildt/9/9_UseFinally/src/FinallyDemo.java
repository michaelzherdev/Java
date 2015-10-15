// ѕрименение блока finally
class UseFinally {
	public static void genException(int what) {
		int t;
		int nums[] = new int[2];
		
		System.out.println("Receiving " + what);
		try {
			switch(what) {
			case 0:
				t = 10 / what; // сгенерировать ошибку делени€ на ноль
				break;
			case 1:
				nums[4] = 4; // сгенерировать ошибку обращени€ к массиву
				break;
			case 2:
				return; // возвратитьс€ из блока try
			}
		}
		catch(ArithmeticException exc) {
			System.out.println("Can`t divide by Zero!");
			return; // возвратить из блока catch
		}
		catch(ArrayIndexOutOfBoundsException exc) {
			System.out.println("No matching element found.");
		}
		// Ётот блок выполн€етс€ независимо от того, каким
		// образом завершаетс€ блок try\catch
		finally {
			System.out.println("Leaving try");
		}
	}
}

public class FinallyDemo {
	public static void main(String[] args) {
		for(int i=0; i<3; i++) {
			UseFinally.genException(i);
			System.out.println();
		}
	}
}