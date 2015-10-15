// Автоупаковка и автораспаковка в выражениях
public class AutoBox3 {
	public static void main(String[] args) {
		Integer iOb, iOb2;
		int i;
		
		iOb = 99;
		System.out.println("Original value of iOb is " + iOb);
		
		//iOb распаковывается, проходят вычиления, результат снова запаковывается
		++iOb;
		System.out.println("After ++iOb: " + iOb);
		
		iOb += 10;
		System.out.println("After iOb+=10: " + iOb);
		
		iOb2 = iOb + (iOb/3);
		System.out.println("iOb2 after expression: " + iOb2);
		
		// здесь вычисляется выражение, но повторная упаковка не производится
		i = iOb + (iOb/3);
		System.out.println("i after expression: " + i);
	}

}
