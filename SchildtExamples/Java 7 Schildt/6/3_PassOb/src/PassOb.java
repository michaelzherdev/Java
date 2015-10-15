// Методам можно передавать объекты
class Block {
	int a, b, c;
	int volume;
	
	Block (int i, int j, int k) {
		a = i;
		b = j;
		c = k;
		volume = a*b*c;
	}
/* возвратить true, если параметр ob определяет
 * такой же параллелепипед.
 * В качестве параметра методу передается объект
 */
	boolean sameBlock (Block ob) {
		if((ob.a==a) & (ob.b==b) & (ob.c==c))
				return true;
		else
			return false;
	}
	/* возвратить true, если параметр ob определяет
	 * параллелепипед такого же объема.
	 * В качестве параметра методу передается объект
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
		// здесь методам передаются объекты
	System.out.println("ob1 same dimension as ob2: " + ob1.sameBlock(ob2));
	System.out.println("ob1 same dimension as ob3: " + ob1.sameBlock(ob3));
	System.out.println("ob1 same volume as ob3: " + ob1.sameVolume(ob2));
	}
}
