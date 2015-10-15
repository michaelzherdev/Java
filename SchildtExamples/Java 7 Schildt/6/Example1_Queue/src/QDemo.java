// ������������������� � ����, ����������� ������� ��� �������� ��������
class Queue {
	private char q[]; // ������ ��� �������� ��������� �������
	private int putloc, getloc; // ������� ���������� � ���������� ��������� �������
	
	Queue (int size) {
		q = new char[size+1]; // �������� ������ ��� �������
		putloc = getloc = 0;
	}
	// ��������� ������ � �������
	void put(char ch) {
		if(putloc==q.length-1) {
			System.out.println(" - Queue is full.");
			return;
		}
		putloc++;
		q[putloc] = ch;
	}
	// ������� ������ �� �������
	char get() {
		if(getloc==putloc) {
			System.out.println(" - Queue is empty.");
			return (char) 0;
		}
		getloc++;
		return q[getloc];
	}
}

public class QDemo {

	public static void main(String[] args) {
		Queue bigQ = new Queue(100);
		Queue smallQ = new Queue(4);
		char ch;
		int i;
		System.out.println("Using bigQ to store the alphabet.");
		// ��������� ��������� ������������� bigQ
		for (i=0; i<26; i++)
			bigQ.put((char) ('A' + i));
		// ������� ��������� ������� �� ������� bigQ � ����������
		System.out.print("Contents of bigQ: ");
		for (i=0; i<26; i++) {
			ch = bigQ.get();
			if(ch != (char) 0) System.out.print(ch);
		}
		
		System.out.println("\n");
		
		System.out.println("Using smallQ to generate errors.");
		for (i=0; i<5; i++) {
			System.out.print("Attempting to store " + (char) ('Z' - i));
			smallQ.put((char) ('Z' - i));
			System.out.println();	
		}
		System.out.println();
		// �������������� ������ ��� ��������� � ������� smallQ
		System.out.print("Contents of smallQ: ");
		for (i=0; i<5; i++) {
			ch = smallQ.get();
			if(ch != (char) 0) System.out.print(ch);
		}
	}

}
