// Отображение текстового файла
/* В этой версии программы оператор try с ресурсами применяется для
 * автоматического закрытия файла, когда он больше не нужен
 */
import java.io.*;

public class ShowFile3 {
	public static void main(String[] args) {
		int i;
		
		// прежде всего следует убедиться, что файл указан
		if(args.length != 1) {
			System.out.println("Usage: ShowFile filename");
			return;
		}
		
		try(FileInputStream fin = new FileInputStream(args[0])) {
			// блок оператора try с ресурсами
			do {
				i = fin.read();
				if(i != -1) System.out.print((char) i);				
			} while(i != -1);
		} catch(IOException exc) {
			System.out.println("I/O Error: " + exc);
		}
	}
}