/* Копирование текстового файла с заменой пробелов дефисами.
 * В этой версии программы используются байтовые потоки.
 * Чтобы воспользоваться программой в командной строке надо указать
 * имена исходного и целевого файлов, например:
 * java Hyphen source target
 */
import java.io.*;

public class Hyphen2 {
	public static void main(String[] args) throws IOException {
		int i;
		
		// проверить сначала, указаны ли оба файла
		if(args.length!=2) {
			System.out.println("Usage: CopyFile From To");
			return;
		}
		
		// скопировать файл и заменить в нем пробелы дефисами
		try (FileReader fin = new FileReader(args[0]);
			FileWriter fout = new FileWriter(args[1])) {
			do {
				i = fin.read();
				// преобразовать пробел в дефис
				if((char)i == ' ') i = '-';
				
				if(i != -1) fout.write(i);
			} while(i != -1);
		} catch(IOException exc) {
			System.out.println("I/O Error: " + exc);
		}
	}
}
