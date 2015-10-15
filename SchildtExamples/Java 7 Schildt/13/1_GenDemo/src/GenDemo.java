// ������� ���������� �����
// ����� � - ��� �������� ����, ���������� ������
// ���������� ���� ��� �������� ������� ������ Gen

// � ���������� ����� ������ � �������� ���������� ���
class Gen<T> {
	T ob; // �������� ������ ���� �
	// �������� ������������ ������ �� ������ ���� �
	Gen(T o) {
		ob = o;
	}
	
	// ���������� ������ ob �� ������
	T getOb() {
		return ob;
	}
	
	// ���������� ��� �
	void showType() {
		System.out.println("Type of T is " + ob.getClass().getName());
	}
}

// ������������������ ���������� �����
public class GenDemo {
	public static void main(String[] args) {
		// �������� ������ �� ������ ���� Gen<Integer>
		Gen<Integer> iOb;
		
		// ������� ������ ���� Gen<Integer> �  ��������� ������ ��
		// ���� ���������� iOb
		iOb = new Gen<Integer>(88); // �������� ��������� ���� Gen<Integer>
		
		// ���������� ���� ������, ������������ � ������� iOb
		iOb.showType();
		
		// ��������� �������� �� ������� iOb
		int v = iOb.getOb();
		System.out.println("value: " + v);
		System.out.println();
		
		// �������� ������� ���� Gen ��� ���������� �����
		// ����� ��������� ������ � ��� ������ ���� Gen<String>
		Gen<String> strOb = new Gen<String>("Generics test");
		
		strOb.showType();
		
		String str = strOb.getOb();
		System.out.println("value: " + str);
	}
}
