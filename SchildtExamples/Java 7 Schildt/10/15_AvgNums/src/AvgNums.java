/* Эта программа находит ср. арифметическое значение для ряда чисел,
 * введенных пользователем с клавиатуры.
 */
import java.io.*;

public class AvgNums {
	public static void main(String[] args) 
	 throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int n;
		double sum = 0.0;
		double avg, t;
		
		System.out.print("How many numbers will you enter: ");
		str = br.readLine();
		try {
// Преобразование символьной строки в числовое значение типа int
			n = Integer.parseInt(str);
		} catch(NumberFormatException exc) {
			System.out.println("Invalid format");
			n = 0;
		}
		
		System.out.println("Enter " + n + " values.");
		for(int i=0; i<n; i++) {
			System.out.print(": ");
			str = br.readLine();
			try {
//Преобразование символьной строки в числовое значение типа double
				t = Double.parseDouble(str);
			} catch(NumberFormatException exc) {
				System.out.println("Invalid format");
				t = 0.0;
			}
			sum +=t;
		}
		avg = sum / n;
		System.out.println("Average is " + avg);
	}
}
