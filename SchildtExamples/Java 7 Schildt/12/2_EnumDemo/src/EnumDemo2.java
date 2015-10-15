// Применение встроенных в перечисление методов
// Перечисление разных видов транспорта
enum Transport {
	CAR, TRUCK, TRAIN, AIRPLANE, BOAT }

class EnumDemo2 {
	public static void main(String[] args) {
		Transport tp;
		
		System.out.println("Here are all Transport constants");

		// воспользоваться методом values()
				// получение массива констант типа Transport
				Transport allTransports[] = Transport.values();
				for(Transport t: allTransports)
					System.out.println(t);
				
				System.out.println();
				
				// воспользоваться методом valuesOf()
				// получение константы под названием AIRPLANE
				tp = Transport.valueOf("AIRPLANE");
				System.out.println("tp contains " + tp);
	}
}
