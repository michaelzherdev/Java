// пример использования аннотации @Deprecated

// пометить класс как рекомендованный к применению
@Deprecated
class MyClass {
	private String msg;
	
	MyClass(String m) {
		msg = m;
	}
	
// пометить метод в классе как не рекомендованный к применению
	@Deprecated
	String getMsg() {
		return msg;
	}
}
public class AnnoDemo {
	public static void main(String[] args) {
		MyClass myObj = new MyClass("test");
		
		System.out.println(myObj.getMsg());
	}

}
