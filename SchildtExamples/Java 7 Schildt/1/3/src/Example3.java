// ќтличие между int и double
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var; // объ€вление целочисленной переменной
		double x; // объ€вление переменной с плавающей точкой
		
		var = 10; // присвоение значени€
		x = 10.0; // присвоение значени€
		
		System.out.println("Original value of var: " + var);
		System.out.println("Original value of x: " + x);
		System.out.println();
		
		//разделим оба значнеи€ на 4:
		var = var / 4;
		x = x / 4;
		
		System.out.println("var after division: " + var);
		System.out.println("x after division: " + x);
	}

}
