// ѕрименение конструктора, переменной экземпл€ра и метода в перечислении
enum Transport {
	CAR(65), TRUCK(55), TRAIN(70), AIRPLANE(600), BOAT(22);
// объ€вление переменной экземпл€ра
	private int speed; // обычна€ скорость каждого транспортного средства
// объ€вление конструктора
	Transport(int s) {speed = s; }
// определение метода
	int getSpeed() {return speed; }
}

class EnumDemo3 {
	public static void main(String[] args) {
		
		// ќбъ€вление ссылки на перечисление Transport
		Transport tp;
		
		// отобразить скорость самолета
		// —корость определ€етс€ с помощью метода getSpeed()
		System.out.println("Typical speed for an airplane is " + 
				Transport.AIRPLANE.getSpeed() + " miles per hour.\n");
		
		// отобразить все виды транспорта и скорости их передвижени€
		System.out.println("All Transport speeds: ");
		for(Transport t : Transport.values())
			System.out.println(t + " typical speed is " + 
					t.getSpeed() + " miles per hour.");
		
	}
}
