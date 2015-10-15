//Ќеожиданный результат продвижени€ типов
public class PromDemo {

	public static void main(String[] args) {
		byte b;
		int i;
		
		b = 10;
/* ¬ данном случае приведение типов не требуетс€,т.к.
	результат вычислени€ выражени€ уже относитс€ к типу int */
		i = b * b;
		
		b = 10;
		/* ¬ данном случае приведение типов требуетс€,дл€
			присваивани€ значени€ int переменной типа byte*/
		b = (byte) (b * b); // cast needed
		
		System.out.println("i and b: " + i + " " + b);
	}

}
