class FDemo {
	int x;
	FDemo(int i){
		x = i;
	}
// вызывается при утилизации объекта
protected void finalize() {
	System.out.println("Finalizing " + x);
}
// Формирует объект, который тотчас уничтожается
void generator(int i) {
	FDemo o = new FDemo(i);
}
}
public class Finalize {
	public static void main(String[] args) {
		int count;
		
		FDemo ob = new FDemo(0);
// формирование большого количества мусора
	for(count=1; count<1000000; count++)
		ob.generator(count);
	}
}
