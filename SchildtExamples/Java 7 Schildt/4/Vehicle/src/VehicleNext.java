
class Vehicles {
			int passengers;
			int fuelcap;
			int mpg;
		
		// Constructor:
		Vehicles(int p, int f, int m){
			passengers = p;
			fuelcap = f;
			mpg = m;
		}
		
		int range(){
			return mpg * fuelcap;
		}
		
		double fuelneeded(int miles){
			return (double) miles/mpg;
		}
		}

class VehicleNext {
	public static void main(String[] args) {
		Vehicles minivan = new Vehicles(7, 16, 21);
		Vehicles sportcar = new Vehicles(2,14,12);
		double gallons;
		int dist = 252;
		
		int range1, range2;
		
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
