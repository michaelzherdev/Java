// применение базового типа
class Gen<T> {
	T ob; // объявить объект итпа Т
	
	Gen(T o) {
		ob = o;
	}
	
	T getOb() {
		return ob;
	}
}

public class RawDemo {
	public static void main(String[] args) {
		Gen<Integer> iOb = new Gen<Integer>(88);
		Gen<String> strOb = new Gen<String>("Generics test");
		
	// если аргумент типа не передается, создать базовый тип
		Gen raw = new Gen(new Double(98.6));
		
	// здесь требуется приведение типов, т.к. тип неизвестен
		double d = (Double) raw.getOb();
		System.out.println("value: " + d);
	}

}
