import java.util.List;


public class Single {
	
	private int a;
	
	private static Single single;
	
	private List<String> list;
	
	private Single(){}
	
	public double pow(double a){
		return a*a;
	}
	
	public static Single getInstance(){
		if(single == null) single = new Single();
		return single;
	}
	
	public void setList(List<String> list){
		this.list = list;
	}
	
	public void printList(){
		for(String s: list) System.out.println(s);
	}
	
	public int getA(){
		System.out.println("getA");
		return a;
	}
}
