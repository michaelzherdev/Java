// Простой обобщенный класс
// Здесь Т - это параметр типа, заменяемый именем
// подлинного типа при создании объекта класса Gen

// в объявлении этого класса Т означает обобщенный тип
class Gen<T> {
	T ob; // объявить объект типа Т
	// передать конструктору ссылку на объект типа Т
	Gen(T o) {
		ob = o;
	}
	
	// возвратить объект ob из метода
	T getOb() {
		return ob;
	}
	
	// отобразить тип Т
	void showType() {
		System.out.println("Type of T is " + ob.getClass().getName());
	}
}

// продемонстрировать обобщенный класс
public class GenDemo {
	public static void main(String[] args) {
		// создание ссылки на объект типа Gen<Integer>
		Gen<Integer> iOb;
		
		// создать объект типа Gen<Integer> и  присвоить ссылку на
		// него переменной iOb
		iOb = new Gen<Integer>(88); // получить экземпляр типа Gen<Integer>
		
		// отобразить типы данных, используемых в объекте iOb
		iOb.showType();
		
		// получение значения из объекта iOb
		int v = iOb.getOb();
		System.out.println("value: " + v);
		System.out.println();
		
		// создание объекта типа Gen для символьных строк
		// здесь создается ссылка и сам объект типа Gen<String>
		Gen<String> strOb = new Gen<String>("Generics test");
		
		strOb.showType();
		
		String str = strOb.getOb();
		System.out.println("value: " + str);
	}
}
