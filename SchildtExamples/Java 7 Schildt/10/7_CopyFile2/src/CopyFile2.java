/* Здесь используется оператор try с ресурсами, демонстрируется управление
 * двумя ресурсами (в данном случае файлами) с помощью единственного
 * оператора try.
 */
import java.io.*;

public class CopyFile2 {
	public static void main(String[] args) 
		throws IOException {
		int i;
		
		// Прежде всего следует убедиться, что файлы указаны.
		if(args.length != 2) {
			System.out.println("Usage: CopyFile From To");
			return;
		}
		
		// открыть исходный файл
		try(FileInputStream fin = new FileInputStream(args[0]);
			FileOutputStream fout = new FileOutputStream(args[1]))  {
		do {
				i = fin.read();
				if(i != -1) fout.write(i);
			} while(i != -1);
		} catch(IOException exc) {
			System.out.println("I/O Error: " + exc);
		}
	}
}
