// ������ ���������� ��������� � ������

class ChkSum {
	//���������� true ���� � ������ �����
	// ����� � - ������������� �������� ������� isEven()
	boolean isEven(int x){
		if((x%2) == 0) return true;
		else return false;
	}
}

public class ParmDemo {
	public static void main(String[] args) {
		ChkSum e = new ChkSum();
		
		if(e.isEven(10)) 
			System.out.println("10 is even");
		if(e.isEven(9)) 
			System.out.println("9 is even");
		if(e.isEven(8)) 
			System.out.println("8 is even");

	}

}
