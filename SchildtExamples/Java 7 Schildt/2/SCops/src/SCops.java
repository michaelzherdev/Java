
public class SCops {

	public static void main(String[] args) {
		int n, d;
		
		n = 10;
		d = 2;
		if (d != 0 && (n % d) == 0)
			System.out.println(d + " is a factor of " +n);
		
		d = 0;
		/*������ ������� �� �����������, �.�. �������� ���������� d = 0.
		 * �.�., ����������� ���������� �������� ������������� ������� �� 0*/
		if (d != 0 && (n % d) == 0)
			System.out.println(d + " is a factor of " +n);
		/* �� �� �������� ��� ������������ ����������� ���������.
		 * �� ���� ��� ����������� ��� ��������, � ���������� 
		 * ��������� ������ ������� �� 0.
		 */
		if (d != 0 & (n % d) == 0)
			System.out.println(d + " is a factor of " +n);

	}

}
