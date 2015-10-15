// »спользование ращновидности for-each цикла for
// дл€ обработки двумерного массива
public class ForEach2 {
	public static void main(String[] args) {
		int nums[][] = new int[3][5];
		int sum = 0;
		
		// ввести р€д значений в массив nums
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 5; j++)
				nums[i][j] = (i+1)*(j+1);
		// использовать разновидность for-each
		// дл€ суммировани€ и отображени€ значений
		// ќбрати внимание на объ€вление переменной х
		for (int x[]: nums) {
			for (int y: x) {
			System.out.println("Value is: " + y);
			sum += y;
		}
		}
		System.out.println("Summation: " + sum);
	}

}
