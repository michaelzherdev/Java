// Демонтрация произвольного доступа к файлам
import java.io.*;

public class RandomAccessDemo {
	public static void main(String[] args) {
		double data[] = {19.4, 10.1, 123.54, 33.0, 87.9, 74.25};
		double d;
	// открыть и использовать файл с произвольным доступом
	// Файл с произвольным доступом открывается для записи и чтения.
		try(RandomAccessFile raf = new RandomAccessFile("random.dat", "rw")) {
			// записать значения в файл
			for(int i=0; i<data.length; i++) {
				raf.writeDouble(data[i]);
			}
	// прочитать отдельные значения из файла.
	// для установки указателя служит метод seek().
		raf.seek(0); // найти первое значение типа double
		d = raf.readDouble();
		System.out.println("First value is " + d);
		
		raf.seek(8); // найти второе значение типа double
		d = raf.readDouble();
		System.out.println("Second value is " + d);
		
		raf.seek(8*3); // найти четвертое значение типа double
		d = raf.readDouble();
		System.out.println("Fourth value is " + d);
		
		System.out.println();
		
	// прочитать значения через одно
		System.out.println("Here is every other value: ");
		for(int i=0; i<data.length; i+=2) {
			raf.seek(8*i); // найти i-тое значение типа double
			d = raf.readDouble();
			System.out.print(d + " ");
		}
		} catch(IOException exc) {
			System.out.println("I/O Error: " + exc);
		}
	}
}
