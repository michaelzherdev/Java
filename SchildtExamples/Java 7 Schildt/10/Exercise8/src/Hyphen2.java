/* ����������� ���������� ����� � ������� �������� ��������.
 * � ���� ������ ��������� ������������ �������� ������.
 * ����� ��������������� ���������� � ��������� ������ ���� �������
 * ����� ��������� � �������� ������, ��������:
 * java Hyphen source target
 */
import java.io.*;

public class Hyphen2 {
	public static void main(String[] args) throws IOException {
		int i;
		
		// ��������� �������, ������� �� ��� �����
		if(args.length!=2) {
			System.out.println("Usage: CopyFile From To");
			return;
		}
		
		// ����������� ���� � �������� � ��� ������� ��������
		try (FileReader fin = new FileReader(args[0]);
			FileWriter fout = new FileWriter(args[1])) {
			do {
				i = fin.read();
				// ������������� ������ � �����
				if((char)i == ' ') i = '-';
				
				if(i != -1) fout.write(i);
			} while(i != -1);
		} catch(IOException exc) {
			System.out.println("I/O Error: " + exc);
		}
	}
}
