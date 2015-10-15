// ���������� ����� finally
class UseFinally {
	public static void genException(int what) {
		int t;
		int nums[] = new int[2];
		
		System.out.println("Receiving " + what);
		try {
			switch(what) {
			case 0:
				t = 10 / what; // ������������� ������ ������� �� ����
				break;
			case 1:
				nums[4] = 4; // ������������� ������ ��������� � �������
				break;
			case 2:
				return; // ������������ �� ����� try
			}
		}
		catch(ArithmeticException exc) {
			System.out.println("Can`t divide by Zero!");
			return; // ���������� �� ����� catch
		}
		catch(ArrayIndexOutOfBoundsException exc) {
			System.out.println("No matching element found.");
		}
		// ���� ���� ����������� ���������� �� ����, �����
		// ������� ����������� ���� try\catch
		finally {
			System.out.println("Leaving try");
		}
	}
}

public class FinallyDemo {
	public static void main(String[] args) {
		for(int i=0; i<3; i++) {
			UseFinally.genException(i);
			System.out.println();
		}
	}
}