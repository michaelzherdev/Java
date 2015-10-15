// Обращение к объекту подкласса по ссылке на объект супер класса.
class X {
	int a;
	X(int i) {
		a = i;
	}
}
class Y extends X {
	int b;
	Y(int i, int j) {
		super(j);
		b = i;
	}
}
public class SupSubRef {
	public static void main(String[] args) {
		X x = new X(10);
		X x2;
		Y y = new Y(5, 6);
		
		x2 = x; // допустимо
		System.out.println("x2.a: " + x2.a);
		
		x2 = y; //опустимо, класс Y явл подклассоа класса X
		System.out.println("x2.a: " + x2.a);
		
		x2.a = 19;
		//x2.b = 27; //error, b не принадлежит классу Х
		
	}

}
