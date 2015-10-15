// Применение класса BufferedReader для чтения символьных строк с консоли
import java.io.*;

public class ReadLines {
	public static void main(String[] args) 
	 throws IOException {
		String str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter lines of text.");
		System.out.println("Enter 'stop' to quit.");
		// читать символы
		do {
			str = br.readLine();
			System.out.println(str);
		} while(!str.equals("stop"));
	}
}
