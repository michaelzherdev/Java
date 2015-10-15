/* � ���� ������ ������ NumericFns ���������� ����, ���������� ��������
 * ���� �, ������ ����� ����� Number ��� ����������� �� ���� ��������,
 * ��� �������� ����
 */
class NumericFns<T extends Number> {
	T num;
	
	// �������� ������������ ������ �� �������� ������
	NumericFns(T n) {
		num = n;
	}
	
	// ���������� �������� ��������
	double reciprocal() {
		return 1 / num.doubleValue();
	}
	
	// ���������� ������� �����
	double fraction() {
		return num.doubleValue() - num.intValue();
	}
}

public class BoundsDemo {
	public static void main(String[] args) {
		// ���������� ������ Integer
		NumericFns<Integer> iOb = 
				new NumericFns<Integer>(5);
		System.out.println("Reciprocal of iOb is " + iOb.reciprocal());
		System.out.println("Fractional component of iOb is " 
					+ iOb.fraction());
		System.out.println();
		
		// ���������� ������ ouble ���� ���������
		NumericFns<Double> dOb = 
				new NumericFns<Double>(5.25);
		System.out.println("Reciprocal of dOb is " + dOb.reciprocal());
		System.out.println("Fractional component of dOb is " 
					+ dOb.fraction());
		System.out.println();

		/*NumericFns<String> dOb = 
		new NumericFns<String>("Error"); - Error!!!
		*/
	}
}
