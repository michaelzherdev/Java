// ќсобенности применени€ перечислени€ Transport
// ќбъ€вление перечислени€
enum Transport {
	CAR, TRUCK, TRAIN, AIRPLANE, BOAT }

class EnumDemo {
	public static void main(String[] args) {
		// ќбъ€вление ссылки на перечисление Transport
		Transport tp;
		// присваивание переменной tp константы AIRPLANE
		tp = Transport.AIRPLANE;
		
		// вывести перечислимое значение
		System.out.println("Value of tp: " + tp);
		System.out.println();
		
		tp = Transport.TRAIN;
		
		// проверка равенства двух объектов типа Transport
		if(tp == Transport.TRAIN) // сравнить 2 перечислимых значени€
			System.out.println("tp contains TRAIN.\n");
		
		// »спользование перечислени€ дл€ управлени€ оператором switch
		switch(tp) {
		case CAR:
			System.out.println("A car carries people");
			break;
		case TRUCK:
			System.out.println("A truck carries freight");
			break;
		case AIRPLANE:
			System.out.println("An airplane flies");
			break;
		case TRAIN:
			System.out.println("A train runs on rails");
			break;
		case BOAT:
			System.out.println("A boat sales on water");
			break;
		}
	}
}
