//����������� ��������� ����������� �����
public class PromDemo {

	public static void main(String[] args) {
		byte b;
		int i;
		
		b = 10;
/* � ������ ������ ���������� ����� �� ���������,�.�.
	��������� ���������� ��������� ��� ��������� � ���� int */
		i = b * b;
		
		b = 10;
		/* � ������ ������ ���������� ����� ���������,���
			������������ �������� int ���������� ���� byte*/
		b = (byte) (b * b); // cast needed
		
		System.out.println("i and b: " + i + " " + b);
	}

}
