// ����������� ���������� ������������ Transport
// ���������� ������������
enum Transport {
	CAR, TRUCK, TRAIN, AIRPLANE, BOAT }

class EnumDemo {
	public static void main(String[] args) {
		// ���������� ������ �� ������������ Transport
		Transport tp;
		// ������������ ���������� tp ��������� AIRPLANE
		tp = Transport.AIRPLANE;
		
		// ������� ������������ ��������
		System.out.println("Value of tp: " + tp);
		System.out.println();
		
		tp = Transport.TRAIN;
		
		// �������� ��������� ���� �������� ���� Transport
		if(tp == Transport.TRAIN) // �������� 2 ������������ ��������
			System.out.println("tp contains TRAIN.\n");
		
		// ������������� ������������ ��� ���������� ���������� switch
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
