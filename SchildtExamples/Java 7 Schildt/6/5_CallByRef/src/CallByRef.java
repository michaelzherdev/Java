// ������� ���������� ������� �� ������
class Test {
	int a, b;
	
	Test(int i, int j) {
		a = i;
		b = j;
	}
/* �������� ������� ������. ������ ���������� ob.a, ob.b
 * �� ������������� ������� ����� ��������
 */
	void change(Test ob) {
		ob.a = ob.a + ob.b;
		ob.b = -ob.b;
	}
}
public class CallByRef {

	public static void main(String[] args) {
		Test ob = new Test(15, 20);
		
		System.out.println("a and b before call: " + ob.a + " " + ob.b);
		ob.change(ob);
		System.out.println("a and b after call: " + ob.a + " " + ob.b);

	}

}
