// �������� � �������� ������ � ������ ������
class MyClass {
	private int alpha;
	public int beta;
	int gamma;
	
	void setAlpha(int a) {
		alpha = a;
}
	int getAlpha() {
		return alpha;
	}
}
class AccessDemo{
	public static void main(String[] args) {
		MyClass ob = new MyClass();
//������ � alpha �������� ������ � �������
// ����. ��������������� �������
		ob.setAlpha(-99);
		System.out.println("ob.alpha is " + ob.getAlpha());
// ��� ���������� � alpha ������:
		//ob.alpha = 10; // Error!
	// ����� ��������� ���������, �.�. ���������� ��������
		ob.beta = 88;
		ob.gamma = 99;
	}
}
