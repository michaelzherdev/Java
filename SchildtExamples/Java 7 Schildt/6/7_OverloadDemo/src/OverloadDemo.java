// ������������ �������
class Overload {
	// ������ ������� ������
	void OvlDemo() {
		System.out.println("No parameters");
	}
	// ������ ������� ������
	void OvlDemo(int a) {
		System.out.println("One parameter: " + a);
	}
		
	// ������ ������� ������
	int OvlDemo(int a, int b) {
		System.out.println("Two parameters: " + a + " " + b);
		return a+b;
	}
	
	// ��������� ������� ������
	double OvlDemo(double a, double b) {
		System.out.println("Two double parameters: " + a + " " + b);
		return a+b;
	}
		
}
public class OverloadDemo {
	public static void main(String[] args) {
		Overload ob = new Overload();
		int resI;
		double resD;
		
		//������� ��� �������� ������ vlDemo
		ob.OvlDemo();
		System.out.println();
		
		ob.OvlDemo(2);
		System.out.println();
		
		resI = ob.OvlDemo(4,6);
		System.out.println("Result of ob.ovlDemo(4,6): " + resI);
		
		resD = ob.OvlDemo(1.1, 2.32);
		System.out.println("Result of ob.ovlDemo(1.1, 2.32): " + resD);
	}

}
