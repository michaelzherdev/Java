// ������� ����� ���������� �������
class Block {
	int a, b, c;
	int volume;
	
	Block (int i, int j, int k) {
		a = i;
		b = j;
		c = k;
		volume = a*b*c;
	}
/* ���������� true, ���� �������� ob ����������
 * ����� �� ��������������.
 * � �������� ��������� ������ ���������� ������
 */
	boolean sameBlock (Block ob) {
		if((ob.a==a) & (ob.b==b) & (ob.c==c))
				return true;
		else
			return false;
	}
	/* ���������� true, ���� �������� ob ����������
	 * �������������� ������ �� ������.
	 * � �������� ��������� ������ ���������� ������
	 */
	boolean sameVolume (Block ob) {
		if(ob.volume==volume) return true;
		else return false;
	}
}

public class PassOb {
	public static void main(String[] args) {
		Block ob1 = new Block(10, 2, 5);
		Block ob2 = new Block(10, 2, 5);
		Block ob3 = new Block(4, 5, 5);
		// ����� ������� ���������� �������
	System.out.println("ob1 same dimension as ob2: " + ob1.sameBlock(ob2));
	System.out.println("ob1 same dimension as ob3: " + ob1.sameBlock(ob3));
	System.out.println("ob1 same volume as ob3: " + ob1.sameVolume(ob2));
	}
}
