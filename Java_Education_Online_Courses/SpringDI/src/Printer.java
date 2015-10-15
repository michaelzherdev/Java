
public class Printer implements IPrintf{
	
	private String s;
	private int a;
	private int b;
	
	public Printer(String s, int a, int b) {
		this.s = s;
		this.a = a;
		this.b = b;
	}



	public void printf(){
		System.out.println(s + " " + a + " " + b);
	}
}
