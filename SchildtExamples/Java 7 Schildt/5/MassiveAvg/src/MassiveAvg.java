// Среднее арифметическое 10 значений типа double
public class MassiveAvg {

	public static void main(String[] args) {
		double nums[] = {2, 3, 4, 5, 6, 12, 1, 32, 67, 100};
		double sum=0;
		
		for (int i = 0; i < nums.length; i++)
			sum +=nums[i];
		System.out.println("Avarage" + sum/nums.length);

	}

}
