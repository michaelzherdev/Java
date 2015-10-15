// Автоупакова и автораспаковка при передаче
// параметров и возврате значений из методов
public class AutoBox2 {
	// этот метод принимает параметр типа Integer
	static void m(Integer v) {
		System.out.println("m() received " + v);
	}
	
	// этот метод принимает параметр типа int
	static int m2() {
		return 10;
	}
	
	// этот метод принимает параметр типа Integer
	static Integer m3() {
		return 99; // автоупаковка значения 99 в объект типа Integer
	}
	public static void main(String[] args) {
	// передача методу m значения типа int
	// метод m принимает параметр типа Integer
	// поэтому значение int автоматически упаковывается
		m(199);
		
	/*  здесь объект iOb получает значение типа int, возвращаемое методом m2.
	 * Это значение автоматически упаковывается, чтобы его можно было
	 * присвоить объекту iOb.
	 */
		Integer iOb = m2();
		System.out.println("Return value from m2() is " + iOb);
		
	/* здесь метод м3 возвращает значение типа Integer, которое
	 * автоматически распаковывается и преобразуется в тип int
	 */
		int i = m3();
		System.out.println("Return value from m3() is " + i);
		
	/* здесь методу Math.sqrt() в кач. параметра передается объект iOb,
	 * который автомат. распаковывается, а его значение продвигается
	 * к типу double, требующемуся для выполнения данного метода
	 */
		iOb = 100;
		System.out.println("Square root of iOb is " + Math.sqrt(iOb));
	}

}
