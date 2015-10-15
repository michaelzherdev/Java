
public class DuimToMetr {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			double duim, meters;
			int counter;
			
			counter = 0;
			for (duim = 1; duim <= 100; duim++) {
				meters = duim * 39.37;
				System.out.println(duim + " duims is " + meters + " meters");
			
			counter++;
			if (counter == 12) {
				System.out.println();
				counter = 0;
			}
		}
	}
}
