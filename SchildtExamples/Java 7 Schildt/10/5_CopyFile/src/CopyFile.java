/* Копирование текстового файла.
 * При вызове этой программы следует указать имя исходного и целевого файлов.
 * Например, в командоной строке:
 * java CopyFile FirstFile.txt SecondFile.txt
 */
import java.io.*;

public class CopyFile {
	public static void main(String[] args) {
		int i;
		FileInputStream fin;
		FileOutputStream fout;
		
		// Прежде всего следует убедиться, что файлы указаны.
		if(args.length != 2) {
			System.out.println("Usage: CopyFile From To");
			return;
		}
		
		// открыть исходный файл
		try {
			fin = new FileInputStream(args[0]);
		} catch(FileNotFoundException exc) {
			System.out.println("Input File Not Found");
			return;
		}
		
		// открыть целевой файл
		try {
			fout = new FileOutputStream(args[1]);
		} catch(FileNotFoundException exc) {
			System.out.println("Error Opening Output File");
			
		// закрыть исходный файл
		try {
			fin.close();
		} catch(IOException exc2) {
			System.out.println("Error Closing Input File");
		} return;
		}
		// копировать файл
		try {
			do {
		// чтение байтов из одного файла и запись их в другой файл.
				i = fin.read();
				if(i != -1) fout.write(i);
			} while(i != -1);
		} catch(IOException exc) {
			System.out.println("File Error");
		}
		
		try {
			fin.close();
		} catch(IOException exc) {
			System.out.println("Error Closing Input File");
		}
		
		try {
			fout.close();
		} catch(IOException exc) {
			System.out.println("Error Closing Output File");
		}
	}
}
