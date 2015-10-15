// ����������� � �������������� ��� ��������
// ���������� � �������� �������� �� �������
public class AutoBox2 {
	// ���� ����� ��������� �������� ���� Integer
	static void m(Integer v) {
		System.out.println("m() received " + v);
	}
	
	// ���� ����� ��������� �������� ���� int
	static int m2() {
		return 10;
	}
	
	// ���� ����� ��������� �������� ���� Integer
	static Integer m3() {
		return 99; // ������������ �������� 99 � ������ ���� Integer
	}
	public static void main(String[] args) {
	// �������� ������ m �������� ���� int
	// ����� m ��������� �������� ���� Integer
	// ������� �������� int ������������� �������������
		m(199);
		
	/*  ����� ������ iOb �������� �������� ���� int, ������������ ������� m2.
	 * ��� �������� ������������� �������������, ����� ��� ����� ����
	 * ��������� ������� iOb.
	 */
		Integer iOb = m2();
		System.out.println("Return value from m2() is " + iOb);
		
	/* ����� ����� �3 ���������� �������� ���� Integer, �������
	 * ������������� ��������������� � ������������� � ��� int
	 */
		int i = m3();
		System.out.println("Return value from m3() is " + i);
		
	/* ����� ������ Math.sqrt() � ���. ��������� ���������� ������ iOb,
	 * ������� �������. ���������������, � ��� �������� ������������
	 * � ���� double, ������������ ��� ���������� ������� ������
	 */
		iOb = 100;
		System.out.println("Square root of iOb is " + Math.sqrt(iOb));
	}

}
