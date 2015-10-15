
public class Lambda {
	public static void main(String args[]){
		MyNumber myNum;
		myNum = () -> 123.45;
		System.out.println(myNum.getValue());
		
		MyNumber myNum2;
		myNum2 = () -> Math.random() * 100;
		System.out.println(myNum2.getValue());
		System.out.println(myNum2.getValue());
	}
}
