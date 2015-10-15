
public class Num<T extends Number> {
	T[] ob;

	public Num(T[] o) {
		ob = o;
	}
	
	double average () {
		double sum = 0.0;
		for ( int i = 0 ; i < ob.length ; i++ )
		sum += ob[i].doubleValue() ;
		return sum/ob.length ;
	}
	
	boolean sameAvg(Num<?> o){
		if(average() == o.average()){
			return true;
		}
		return false;
	}
	
	static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y){
		for(int i = 0; i < y.length; i++){
			if (x.equals(y[i]))
				return true;
			}
			return false;
	}
	
	public static void main(String args[]){
		Integer[] ob = {1, 2, 3, 4, 5};
		Num<Integer> mas = new Num<Integer>(ob);
		double v = mas.average();
		System.out.println(v);
		
		Double[] nums = {1.0, 2.0, 3.0, 4.0, 5.0};
		Num<Double> se = new Num<Double>(nums);
		System.out.println(se.average());
		
		if(mas.sameAvg(se)){
		System.out.println("same");
		}
		
		if (isIn(2, ob)) System.out.println("in");
		if (!isIn(7, ob)) System.out.println("out");
	}
}
