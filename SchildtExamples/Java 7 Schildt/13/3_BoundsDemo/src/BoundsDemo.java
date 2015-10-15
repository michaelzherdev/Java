/* в этой версии класса NumericFns аргументом типа, заменяющим параметр
 * типа Т, должен стать класс Number или производный от него подкласс,
 * как показано ниже
 */
class NumericFns<T extends Number> {
	T num;
	
	// передать конструктору ссылку на числовой объект
	NumericFns(T n) {
		num = n;
	}
	
	// возвратить обратную величину
	double reciprocal() {
		return 1 / num.doubleValue();
	}
	
	// возвратить дробную часть
	double fraction() {
		return num.doubleValue() - num.intValue();
	}
}

public class BoundsDemo {
	public static void main(String[] args) {
		// применение класса Integer
		NumericFns<Integer> iOb = 
				new NumericFns<Integer>(5);
		System.out.println("Reciprocal of iOb is " + iOb.reciprocal());
		System.out.println("Fractional component of iOb is " 
					+ iOb.fraction());
		System.out.println();
		
		// применение класса ouble тоже допустимо
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
