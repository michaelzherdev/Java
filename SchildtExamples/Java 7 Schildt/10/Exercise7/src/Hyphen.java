/* Копирование текстового файла с заменой пробелов дефисами.
 * В этой версии программы используются байтовые потоки.
 * Чтобы воспользоваться программой в командной строке надо указать
 * имена исходного и целевого файлов, например:
 * java Hyphen source target
 */
import java.io.*;

public class Hyphen {
	public static void main(String[] args) {
		int i;
		FileInputStream fin = null;
		FileOutputStream fout = null;
		// проверить сначала, указаны ли оба файла
		if(args.length != 2) {
			System.out.println("Usage: Hyphen From To");
			return;
		}
		
		// скопировать файл и заменить в нем пробелы дефисами
		try {
			fin = new FileInputStream(args[0]);
			fout = new FileOutputStream(args[1]);
			
			do {
				i = fin.read();
				// преобразовать пробел в дефис
				if((char)i == ' ') i = '-';
				
				if(i != -1) fout.write(i);
			} while(i != -1);
		} catch(IOException exc) {
			System.out.println("I/O Error: " + exc);
		} finally {
			try {
				if(fin != null) fin.close();
			} catch(IOException exc) {
				System.out.println("Error closing input file");
			}
			
			try {
				if(fin != null) fout.close();
			} catch(IOException exc) {
				System.out.println("Error closing output file");
			}
		}
	}
}
