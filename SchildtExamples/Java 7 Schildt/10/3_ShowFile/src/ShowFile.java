// Отображение текстового файла
import java.io.*;

public class ShowFile {
	public static void main(String[] args) {
		int i;
		FileInputStream fin;
		
		// прежде всего следует убедиться, что файл указан
		if(args.length != 1) {
			System.out.println("Usage: ShowFile File");
			return;
		}
		
		try {
			// открытие файла
			fin = new FileInputStream(args[0]);
		} catch(FileNotFoundException exc) {
			System.out.println("File not found");
			return;
		}
		
		try {
			// читать из файла, пока не встретится знак EOF.
			do {
				// Чтение из файла.
				i = fin.read();
				if(i != -1) System.out.print((char) i);
				//Если значение переменной i равно -1, значит
				// достигнут конец файла.
			} while(i != -1);
		} catch(IOException exc) {
			System.out.println("Error reading file");
		}
		
		try {
			// закрытие файла
			fin.close();
		} catch(IOException exc) {
			System.out.println("Error closing file");
		}
	}
}
