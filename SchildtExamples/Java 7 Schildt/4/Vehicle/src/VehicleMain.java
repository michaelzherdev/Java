
class Vehicle {
			int passengers;
			int fuelcap;
			int mpg;
			
		/*void range() {
			System.out.println("Range is " + fuelcap * mpg);
		}*/
		int range(){
			return mpg * fuelcap;
		}
	/* добавление параметризированного метода, в котором производится
	 * расчет объема топлива, необходимого транспортному средству для
	 * преодоления заданного расстояния.
	 */
		double fuelneeded(int miles){
			return (double) miles/mpg;
		}
		}

class VehicleMain {
	public static void main(String[] args) {
		Vehicle minivan = new Vehicle();
		Vehicle sportcar = new Vehicle();
		double gallons;
		int dist = 252;
		
		int range1, range2;
		
		minivan.fuelcap = 16;
		minivan.passengers = 7;
		minivan.mpg = 21;
		
		sportcar.fuelcap = 14;
		sportcar.passengers = 2;
		sportcar.mpg = 12;
		
		/*System.out.print("Minivan can carry " + 
		minivan.passengers + ". ");
		minivan.range();
		System.out.print("Sportcar can carry " + 
				sportcar.passengers + ". ");
		sportcar.range();*/
		
		range1 = minivan.range();
		range2 = sportcar.range();
		System.out.println("Minivan can carry " + 
		minivan.passengers + " with range of " + range1 +" miles");
		System.out.println("Sportcar can carry " + 
		sportcar.passengers + " with range of " + range2 +" miles");
		
		System.out.println();
		gallons = minivan.fuelneeded(dist);
		System.out.println("To go " + dist + " miles minivan needs " + gallons + " gallons of fuel.");
		gallons = sportcar.fuelneeded(dist);
		System.out.println("To go " + dist + " miles sportcar needs " + gallons + " gallons of fuel.");
	}

}
