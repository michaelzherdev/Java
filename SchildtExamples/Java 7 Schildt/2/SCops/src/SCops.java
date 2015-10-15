
public class SCops {

	public static void main(String[] args) {
		int n, d;
		
		n = 10;
		d = 2;
		if (d != 0 && (n % d) == 0)
			System.out.println(d + " is a factor of " +n);
		
		d = 0;
		/*¬торой операнд не вычисл€етс€, т.к. значение переменной d = 0.
		 * “.о., укороченный логический оператор предотвращает деление на 0*/
		if (d != 0 && (n % d) == 0)
			System.out.println(d + " is a factor of " +n);
		/* “е же действи€ без укороченного логического оператора.
		 * на этот раз вычисл€ютс€ оба операнда, в результате 
		 * возникает ошибка делени€ на 0.
		 */
		if (d != 0 & (n % d) == 0)
			System.out.println(d + " is a factor of " +n);

	}

}
