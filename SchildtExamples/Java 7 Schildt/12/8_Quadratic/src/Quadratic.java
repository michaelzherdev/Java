// ������� ����������� ���������
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Quadratic {
	public static void main(String[] args) {
		double a, b, c, x;
		
		// ������ ��������� 4x2+x-3=0
		a=4;
		b=1;
		c=-3;
		
		// ����� ������ �������
		x = (-b + sqrt(pow(b, 2) - 4 * a * c)) / (2 * a);
		System.out.println("First solution: " + x);
		// ����� ������ �������
		x = (-b -  Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
		System.out.println("Second solution: " + x);
	}

}
