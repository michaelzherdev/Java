// Отображение текстового файла
/* В этой версии программы код, открывающий файл и получающий к нему доступ,
 * заключается в единственный блок try. Ф закрывается файл в блоке finally.
 */
import java.io.*;

public class ShowFile2 {
	public static void main(String[] args) {
		int i;
		FileInputStream fin = null;
		
		// прежде всего следует убедиться, что файл указан
		if(args.length != 1) {
			System.out.println("Usage: ShowFile filename");
			return;
		}
		
		try {
			// открытие файла
			fin = new FileInputStream(args[0]);
			
			do {// Чтение из файла.
				i = fin.read();
				if(i != -1) System.out.print((char) i);				
			} while(i != -1);
		} catch(FileNotFoundException exc) {
			System.out.println("File Not Found");
		} catch(IOException exc) {
			System.out.println("An I/O Error Occurred");
		} finally {
			// файл закрывается в любом случае
			try {
			if(fin != null) fin.close();
		} catch(IOException exc) {
			System.out.println("Error closing file");
		}
	}
}
}