// Открытый и закрытый доступ к членам класса
class MyClass {
	private int alpha;
	public int beta;
	int gamma;
	
	void setAlpha(int a) {
		alpha = a;
}
	int getAlpha() {
		return alpha;
	}
}
class AccessDemo{
	public static void main(String[] args) {
		MyClass ob = new MyClass();
//доступ к alpha возможен только с помощью
// спец. предназначенных методов
		ob.setAlpha(-99);
		System.out.println("ob.alpha is " + ob.getAlpha());
// так обращаться к alpha нельзя:
		//ob.alpha = 10; // Error!
	// такие обращения допустимы, т.к. переменные открытые
		ob.beta = 88;
		ob.gamma = 99;
	}
}
