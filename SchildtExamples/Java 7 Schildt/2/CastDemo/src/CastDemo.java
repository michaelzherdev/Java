//ƒемонстраци€ приведени€ типов
public class CastDemo {

	public static void main(String[] args) {
		double x, y;
		byte b;
		int i;
		char ch;
		
		x = 10.0;
		y = 3.0;
		//¬ данном случае тер€етс€ дробна€ часть числа
		i = (int) (x / y); // привести тип double к типу int
		System.out.println("Integer outcome of x /y: " + i);
		
		i = 100;
		b = (byte) i;
		System.out.println("Value of b: " + b);
		
		i = 257;
		b = (byte) i;// анные тер€ютс€ “ип byte  не может содержать значение 257
		System.out.println("Value of b: " + b);
		
		b = 88;
		ch = (char) b;
		System.out.println("ch: " + ch);
	}

}
