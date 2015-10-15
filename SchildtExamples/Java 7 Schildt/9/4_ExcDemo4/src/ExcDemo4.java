// применение нескольких операторов catch
public class ExcDemo4 {
	public static void main(String[] args) {
		int numer[] = {4, 8, 16, 32, 64, 128, 256, 512};
		int denom[] = {2, 0, 4, 4, 0, 8};
		
		for(int i=0; i<numer.length; i++) {
			try {
				System.out.println(numer[i] + " / " + denom[i] + 
						" is " + numer[i]/denom[i]);
			}
			/*catch(ArithmeticException exc) {
				// перехватить исключение
				System.out.println("Can`t divide by 0!");
			}*/
			catch(ArrayIndexOutOfBoundsException exc) {
				// перехватить исключение
				System.out.println("No matching element found");
			}
			catch(Throwable exc) {
				// перехватить исключение
				System.out.println("Some exception occurred");
			}
		}

	}

}
