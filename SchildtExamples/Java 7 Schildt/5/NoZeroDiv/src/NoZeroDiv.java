// Предотвращение деление на ноль с помощью оператора ?
public class NoZeroDiv {

	public static void main(String[] args) {
		int result;
		for (int i = -5; i < 6; i++) {
			//Деление на нуль предотвращается
			result = i !=0 ? 100 / i : 0;
			if(i!=0)
				System.out.println("100 / " + i + " is " + result);
			
			/* то же самое
			 * for (int i = -5; i < 6; i++)
			 * if(i!=0 ? true : false);
			 *System.out.println("100 / " + i + " is " + 100/i);
			 */
		}

	}

}
