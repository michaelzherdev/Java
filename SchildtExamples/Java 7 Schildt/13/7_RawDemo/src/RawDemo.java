// ���������� �������� ����
class Gen<T> {
	T ob; // �������� ������ ���� �
	
	Gen(T o) {
		ob = o;
	}
	
	T getOb() {
		return ob;
	}
}

public class RawDemo {
	public static void main(String[] args) {
		Gen<Integer> iOb = new Gen<Integer>(88);
		Gen<String> strOb = new Gen<String>("Generics test");
		
	// ���� �������� ���� �� ����������, ������� ������� ���
		Gen raw = new Gen(new Double(98.6));
		
	// ����� ��������� ���������� �����, �.�. ��� ����������
		double d = (Double) raw.getOb();
		System.out.println("value: " + d);
	}

}
