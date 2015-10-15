// Применение класса BufferedReader для чтения символов с консоли
import java.io.*;

public class ReadChars {
	public static void main(String[] args) 
	 throws IOException {
		char c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter characters, period to quit.");
		// читать символы
		do {
			c = (char) br.read();
			System.out.println(c);
		} while(c != '.');
	}
}
